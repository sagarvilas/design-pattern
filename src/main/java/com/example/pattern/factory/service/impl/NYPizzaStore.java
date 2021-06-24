package com.example.pattern.factory.service.impl;


import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import com.example.pattern.factory.service.api.pizza.Pizza;
import com.example.pattern.factory.service.api.pizza.PizzaStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("nyStyle")
@RequiredArgsConstructor
public class NYPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory nyPizzaIngredientFactory;

    protected Pizza createPizza(String item) {
        Pizza pizza = startPreparing(item, " NY style", nyPizzaIngredientFactory);
        if (null != pizza) {
            return pizza;
        }
        return null; //TODO throw error
    }

}
