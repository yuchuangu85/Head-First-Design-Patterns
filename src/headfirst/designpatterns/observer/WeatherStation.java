package headfirst.designpatterns.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);
		ForecastDisplay forecastDisplay = new ForecastDisplay(data);

		data.setMeasurements(80, 65, 30.4f);
		data.setMeasurements(76, 60, 28.2f);

	}

}
