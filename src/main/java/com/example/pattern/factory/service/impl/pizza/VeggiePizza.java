package com.example.pattern.factory.service.impl.pizza;

import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import com.example.pattern.factory.service.api.pizza.Pizza;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Qualifier("veggiePizza")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Setter
public class VeggiePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;

	public VeggiePizza(String name, PizzaIngredientFactory ingredientFactory) {
		this.name = name;
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}

}
