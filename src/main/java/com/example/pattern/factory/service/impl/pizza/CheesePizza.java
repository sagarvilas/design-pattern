package com.example.pattern.factory.service.impl.pizza;

import com.example.pattern.factory.service.api.pizza.Pizza;
import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Qualifier("cheesePizza")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Setter
public class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(String name, PizzaIngredientFactory ingredientFactory) {
        this.name = name + "Cheese pizza";
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

    @Override
    public void setName(String name) {
        this.name = name + " Cheese pizza";
    }
}
