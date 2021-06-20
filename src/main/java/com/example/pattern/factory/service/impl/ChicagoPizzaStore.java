package com.example.pattern.factory.service.impl;

import com.example.pattern.factory.service.api.pizza.Pizza;
import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import com.example.pattern.factory.service.api.pizza.PizzaStore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service("chicagoStyle")
@AllArgsConstructor
public class ChicagoPizzaStore extends PizzaStore {

    private PizzaIngredientFactory chicagoPizzaIngredientFactory;

    protected Pizza createPizza(String item) {
        Pizza pizza = startPreparing(item, chicagoPizzaIngredientFactory);
        if (null != pizza ) {
            return pizza;
        }
        return null; //TODO throw error
    }
}
