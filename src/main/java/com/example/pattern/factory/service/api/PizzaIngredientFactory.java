package com.example.pattern.factory.service.api;

import com.example.pattern.factory.service.api.ingredient.*;

import java.util.List;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public List<Veggies> createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
