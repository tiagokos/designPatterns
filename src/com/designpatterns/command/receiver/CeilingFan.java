package com.designpatterns.command.receiver;

public class CeilingFan {
	
	String description;
	
	public CeilingFan(String description) {
		this.description = description;
	}

	public void off() {
		System.out.println(description + " ceiling fan is off");		
	}
	
	public void on() {
		System.out.println(description + " ceiling fan is on");		
	}
	
}
