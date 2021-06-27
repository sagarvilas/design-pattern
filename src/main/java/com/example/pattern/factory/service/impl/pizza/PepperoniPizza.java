package com.example.pattern.factory.service.impl.pizza;

import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import com.example.pattern.factory.service.api.pizza.Pizza;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Qualifier("pepperoniPizza")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Slf4j
public class PepperoniPizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(String name, PizzaIngredientFactory ingredientFactory) {
		this.name = name;
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		log.info("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}

}
