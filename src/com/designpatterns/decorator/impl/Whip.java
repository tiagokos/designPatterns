package com.designpatterns.decorator.impl;

import com.designpatterns.decorator.Beverage;
import com.designpatterns.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}
