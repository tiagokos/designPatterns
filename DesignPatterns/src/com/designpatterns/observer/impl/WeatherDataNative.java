package com.designpatterns.observer.impl;

import java.util.Observable;

public class WeatherDataNative extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataNative() {
		
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

}
