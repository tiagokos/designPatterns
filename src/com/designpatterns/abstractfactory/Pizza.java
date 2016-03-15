package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.product.Cheese;
import com.designpatterns.abstractfactory.product.Clams;
import com.designpatterns.abstractfactory.product.Dough;
import com.designpatterns.abstractfactory.product.Pepperoni;
import com.designpatterns.abstractfactory.product.Sauce;
import com.designpatterns.abstractfactory.product.Veggies;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}

}
