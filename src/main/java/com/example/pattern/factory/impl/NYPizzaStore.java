package com.example.pattern.factory.impl;


import com.example.pattern.factory.api.Pizza;
import com.example.pattern.factory.api.PizzaIngredientFactory;
import com.example.pattern.factory.api.PizzaStore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service("nyStyle")
@AllArgsConstructor
public class NYPizzaStore extends PizzaStore {

    private PizzaIngredientFactory NYPizzaIngredientFactory;

    protected Pizza createPizza(String item) {
        Pizza pizza = startPreparing(item, NYPizzaIngredientFactory);
        if (null != pizza ) {
            return pizza;
        }
        return null; //TODO throw error
    }

}
