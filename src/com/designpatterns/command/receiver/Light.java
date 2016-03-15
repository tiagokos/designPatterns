package com.designpatterns.command.receiver;

public class Light {
	
	String description;
	
	public Light(String description) {
		this.description = description;
	}

	public void off() {
		System.out.println(description + " light is off");		
	}
	
	public void on() {
		System.out.println(description + " light is on");		
	}

}
