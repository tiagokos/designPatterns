package com.designpatterns.abstractfactory;

import com.designpatterns.factory.product.ChicagoStyleCheesePizza;
import com.designpatterns.factory.product.Pizza;


public class ChicagoPizzaStore extends PizzaStore {
	
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return null;
		} else if (type.equals("clam")) {
			return null;
		} else if (type.equals("pepperoni")) {
			return null;
		} else {
			return null;
		}
	}

}
