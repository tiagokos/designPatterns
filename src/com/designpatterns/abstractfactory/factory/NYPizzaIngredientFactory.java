package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.product.Cheese;
import com.designpatterns.abstractfactory.product.Clams;
import com.designpatterns.abstractfactory.product.Dough;
import com.designpatterns.abstractfactory.product.FreshClams;
import com.designpatterns.abstractfactory.product.Garlic;
import com.designpatterns.abstractfactory.product.MarinaraSauce;
import com.designpatterns.abstractfactory.product.Mushroom;
import com.designpatterns.abstractfactory.product.Onion;
import com.designpatterns.abstractfactory.product.Pepperoni;
import com.designpatterns.abstractfactory.product.RedPepper;
import com.designpatterns.abstractfactory.product.ReggianoCheese;
import com.designpatterns.abstractfactory.product.Sauce;
import com.designpatterns.abstractfactory.product.SlicedPepperoni;
import com.designpatterns.abstractfactory.product.ThinCrustDough;
import com.designpatterns.abstractfactory.product.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}

}
