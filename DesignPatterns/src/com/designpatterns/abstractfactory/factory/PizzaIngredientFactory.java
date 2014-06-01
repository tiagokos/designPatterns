package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.product.Cheese;
import com.designpatterns.abstractfactory.product.Clams;
import com.designpatterns.abstractfactory.product.Dough;
import com.designpatterns.abstractfactory.product.Pepperoni;
import com.designpatterns.abstractfactory.product.Sauce;
import com.designpatterns.abstractfactory.product.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	
}
