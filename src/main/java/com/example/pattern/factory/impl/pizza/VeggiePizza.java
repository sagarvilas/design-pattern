package com.example.pattern.factory.impl.pizza;

import com.example.pattern.factory.api.Pizza;
import com.example.pattern.factory.api.PizzaIngredientFactory;
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
	PizzaIngredientFactory ingredientFactory;
 
//	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
//		this.ingredientFactory = ingredientFactory;
//	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}

	@Override
	public void setName(String name) {
		this.name = name + "Veggie pizza";
	}
}
