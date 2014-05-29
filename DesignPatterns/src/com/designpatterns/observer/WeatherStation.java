package com.designpatterns.observer;

import com.designpatterns.observer.impl.CurrentConditionsDisplay;
import com.designpatterns.observer.impl.WeatherData;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 27.5f);
		weatherData.setMeasurements(90, 15, 17.5f);
		weatherData.setMeasurements(25, 25, 22.5f);
	}

}
