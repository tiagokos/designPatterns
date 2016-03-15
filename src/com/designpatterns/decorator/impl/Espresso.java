package com.designpatterns.decorator.impl;

import com.designpatterns.decorator.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Expresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
