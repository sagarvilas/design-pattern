package com.example.pattern.factory.service.api.pizza;

import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    @Lookup("cheesePizza")
    protected Pizza getCheesePizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        return null;
    }

    @Lookup("clamPizza")
    protected Pizza getClamPizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        return null;
    }

    @Lookup("pepperoniPizza")
    protected Pizza getPepperoniPizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        return null;
    }

    @Lookup("veggiePizza")
    protected Pizza getVeggiePizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        return null;
    }

    public Pizza startPreparing(String name, String style, PizzaIngredientFactory pizzaIngredientFactory) {
        Pizza pizza = null;
        // You: This does not look very good
        // Me: Yea, I know, please let me know if there is a better way
        if ("cheesePizza".equalsIgnoreCase(name)) {
            pizza = getCheesePizza(style + " Cheese Pizza", pizzaIngredientFactory);
        } else if ("clamPizza".equalsIgnoreCase(name)) {
            pizza = getClamPizza(style + " Clam Pizza", pizzaIngredientFactory);
        } else if ("pepperoniPizza".equalsIgnoreCase(name)) {
            pizza = getPepperoniPizza(style + " Pepperoni Pizza", pizzaIngredientFactory);
        } else if ("veggiePizza".equalsIgnoreCase(name)) {
            pizza = getVeggiePizza(style + " Veggie Pizza", pizzaIngredientFactory);
        }
        return pizza;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        log.info("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
