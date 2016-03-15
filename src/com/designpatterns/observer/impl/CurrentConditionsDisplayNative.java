package com.designpatterns.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.designpatterns.observer.DisplayElement;
import com.designpatterns.observer.Subject;

public class CurrentConditionsDisplayNative implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionsDisplayNative(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof WeatherDataNative) {
			WeatherDataNative wdn = (WeatherDataNative) arg0;
			this.temperature = wdn.getTemperature();
			this.humidity = wdn.getHumidity();
			
			display();
		}

	}
	
	

}
