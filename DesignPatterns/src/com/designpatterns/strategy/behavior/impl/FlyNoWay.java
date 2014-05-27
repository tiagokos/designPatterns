package com.designpatterns.strategy.behavior.impl;

import com.designpatterns.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {		
		System.out.println("I can't fly");
	}	

}
