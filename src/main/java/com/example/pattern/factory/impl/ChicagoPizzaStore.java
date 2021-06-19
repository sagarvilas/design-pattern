package com.example.pattern.factory.impl;

import com.example.pattern.factory.api.Pizza;
import com.example.pattern.factory.api.PizzaIngredientFactory;
import com.example.pattern.factory.api.PizzaStore;
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
