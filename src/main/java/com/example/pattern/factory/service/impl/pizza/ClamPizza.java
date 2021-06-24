package com.example.pattern.factory.service.impl.pizza;

import com.example.pattern.factory.service.api.pizza.Pizza;
import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Qualifier("clamPizza")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Setter
public class ClamPizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;

	public ClamPizza(String name, PizzaIngredientFactory ingredientFactory) {
		this.name = name;
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
		veggies = ingredientFactory.createVeggies();
	}

}
