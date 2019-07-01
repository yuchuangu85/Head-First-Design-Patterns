package headfirst.designpatterns.observer;

/**
 * 具体观察者
 */
public class ForecastDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Forecast conditions: " + temperature + "F degrees and "
				+ humidity + "% humidity");
	}
}
