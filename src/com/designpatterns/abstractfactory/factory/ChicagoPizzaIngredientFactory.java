package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.product.BlackOlives;
import com.designpatterns.abstractfactory.product.Cheese;
import com.designpatterns.abstractfactory.product.Clams;
import com.designpatterns.abstractfactory.product.Dough;
import com.designpatterns.abstractfactory.product.EggPlant;
import com.designpatterns.abstractfactory.product.FrozemClam;
import com.designpatterns.abstractfactory.product.Mozzarella;
import com.designpatterns.abstractfactory.product.Pepperoni;
import com.designpatterns.abstractfactory.product.PlumTomatoSauce;
import com.designpatterns.abstractfactory.product.Sauce;
import com.designpatterns.abstractfactory.product.SlicedPepperoni;
import com.designpatterns.abstractfactory.product.Spinach;
import com.designpatterns.abstractfactory.product.ThickCrustDough;
import com.designpatterns.abstractfactory.product.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new Mozzarella();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Spinach(), new BlackOlives(), new EggPlant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozemClam();
	}

}
