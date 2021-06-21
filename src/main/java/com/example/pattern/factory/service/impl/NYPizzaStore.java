package com.example.pattern.factory.service.impl;


import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import com.example.pattern.factory.service.api.pizza.Pizza;
import com.example.pattern.factory.service.api.pizza.PizzaStore;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("nyStyle")
public class NYPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory nYPizzaIngredientFactory;

    public NYPizzaStore(@Qualifier("nYPizzaIngredientFactory") PizzaIngredientFactory nYPizzaIngredientFactory) {
        this.nYPizzaIngredientFactory = nYPizzaIngredientFactory;
    }

    protected Pizza createPizza(String item) {
        Pizza pizza = startPreparing(item, " NY style", nYPizzaIngredientFactory);
        if (null != pizza) {
            return pizza;
        }
        return null; //TODO throw error
    }

}
