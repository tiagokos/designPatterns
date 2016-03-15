package com.designpatterns.decorator.impl;

import com.designpatterns.decorator.Beverage;

public class Decaf extends Beverage {
	
	public Decaf() {
		description = "Decaf Coffee";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}
