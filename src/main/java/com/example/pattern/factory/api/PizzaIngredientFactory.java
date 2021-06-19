package com.example.pattern.factory.api;

import com.example.pattern.factory.api.ingredient.*;

import java.util.List;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public List<Veggies> createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
