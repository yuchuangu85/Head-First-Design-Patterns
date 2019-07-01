package headfirst.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 */
public class WeatherData implements Subject {

	private List<Observer> observerList;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observerList.indexOf(o);
		if (index >= 0) {
			observerList.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observerList) {
			o.update(temperature, humidity, pressure);
		}
	}

	private void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
