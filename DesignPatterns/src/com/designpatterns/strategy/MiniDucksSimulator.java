package com.designpatterns.strategy;

import com.designpatterns.strategy.behavior.impl.FlyRocketPowered;

public class MiniDucksSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	
}
