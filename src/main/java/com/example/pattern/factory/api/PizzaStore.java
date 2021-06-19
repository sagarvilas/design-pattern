package com.example.pattern.factory.api;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item);

	@Lookup
	protected Pizza getPizza(String name){
		return null;
	};

	public Pizza startPreparing(String name, PizzaIngredientFactory pizzaIngredientFactory){
		Pizza pizza = getPizza(name);
		pizza.setName(name);
		pizza.setIngredientFactory(pizzaIngredientFactory);
		return pizza;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
