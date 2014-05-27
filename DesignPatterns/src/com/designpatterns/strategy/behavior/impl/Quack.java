package com.designpatterns.strategy.behavior.impl;

import com.designpatterns.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");		
	}
	
}
