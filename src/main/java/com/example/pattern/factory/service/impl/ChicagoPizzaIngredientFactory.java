package com.example.pattern.factory.service.impl;

import com.example.pattern.factory.service.api.PizzaIngredientFactory;
import com.example.pattern.factory.service.api.ingredient.*;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("chicagoPizzaIngredientFactory")
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Lookup("thickCrustDough")
    public Dough createDough() {
        return null;
    }

    @Lookup("plumTomatoSauce")
    public Sauce createSauce() {
        return null;
    }

    @Lookup("mozzarellaCheese")
    public Cheese createCheese() {
        return null;
    }

    @Lookup("chicagoPizzaVeggies")
    public List<Veggies> createVeggies() {
        return null;
    }

    @Lookup("slicedPepperoni")
    public Pepperoni createPepperoni() {
        return null;
    }

    @Lookup("frozenClams")
    public Clams createClam() {
        return null;
    }
}