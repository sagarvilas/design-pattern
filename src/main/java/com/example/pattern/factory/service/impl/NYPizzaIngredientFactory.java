package com.example.pattern.factory.service.impl;

import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import com.example.pattern.factory.service.api.ingredient.*;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("nyPizzaIngredientFactory")
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Lookup("thinCrustDough")
    public Dough createDough() {
        return null;
    }

    @Lookup("marinaraSauce")
    public Sauce createSauce() {
        return null;
    }

    @Lookup("reggianoCheese")
    public Cheese createCheese() {
        return null;
    }

    @Lookup("nYPizzaVeggies")
    public List<Veggies> createVeggies() {
        return null;
    }

    @Lookup("slicedPepperoni")
    public Pepperoni createPepperoni() {
        return null;
    }

    @Lookup("freshClams")
    public Clams createClam() {
        return null;
    }
}
