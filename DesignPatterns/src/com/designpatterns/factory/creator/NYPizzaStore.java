package com.designpatterns.factory.creator;

import com.designpatterns.factory.product.NYStyleCheesePizza;
import com.designpatterns.factory.product.Pizza;


public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
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
