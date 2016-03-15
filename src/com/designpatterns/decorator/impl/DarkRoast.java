package com.designpatterns.decorator.impl;

import com.designpatterns.decorator.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return .99;
	}

}
