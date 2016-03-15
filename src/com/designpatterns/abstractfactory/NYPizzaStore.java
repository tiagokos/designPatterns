package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.factory.NYPizzaIngredientFactory;
import com.designpatterns.abstractfactory.factory.PizzaIngredientFactory;



public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("veggie")) {
			return null;
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (type.equals("pepperoni")) {
			return null;
		} else {
			return null;
		}
		return pizza;
	}

}
