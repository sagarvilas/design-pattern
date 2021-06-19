package com.example.pattern.factory.impl;

import com.example.pattern.factory.api.PizzaIngredientFactory;
import com.example.pattern.factory.api.ingredient.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("NYPizzaIngredientFactory")
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    private Dough thinCrustDough;
    private Sauce marinaraSauce;
    private Cheese reggianoCheese;
    private List<Veggies> NYPizzaVeggies;
    private Pepperoni slicedPepperoni;
    private Clams freshClams;

    public Dough createDough() {
        return thinCrustDough;
    }

    public Sauce createSauce() {
        return marinaraSauce;
    }

    public Cheese createCheese() {
        return reggianoCheese;
    }

    public List<Veggies> createVeggies() {
        return NYPizzaVeggies;
    }

    public Pepperoni createPepperoni() {
        return slicedPepperoni;
    }

    public Clams createClam() {
        return freshClams;
    }
}
