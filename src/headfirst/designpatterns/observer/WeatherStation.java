package headfirst.designpatterns.observer;

import headfirst.designpatterns.observer.observer.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.observer.ForecastDisplay;
import headfirst.designpatterns.observer.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);
		ForecastDisplay forecastDisplay = new ForecastDisplay(data);

		data.setMeasurements(80, 65, 30.4f);
		data.setMeasurements(76, 60, 28.2f);

		data.removeObserver(forecastDisplay);
		data.removeObserver(currentConditionsDisplay);

	}

}
