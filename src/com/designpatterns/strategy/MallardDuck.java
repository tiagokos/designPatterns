package com.designpatterns.strategy;

import com.designpatterns.strategy.behavior.impl.FlyWithWings;
import com.designpatterns.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");		
	}

}
