package com.example.pattern.factory.impl;

import com.example.pattern.factory.api.PizzaIngredientFactory;
import com.example.pattern.factory.api.ingredient.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    private Dough thickCrustDough;
    private Sauce plumTomatoSauce;
    private Cheese mozzarellaCheese;
    private List<Veggies> ChicagoPizzaVeggies;
    private Pepperoni slicedPepperoni;
    private Clams frozenClams;

    public Dough createDough() {
        return thickCrustDough;
    }

    public Sauce createSauce() {
        return plumTomatoSauce;
    }

    public Cheese createCheese() {
        return mozzarellaCheese;
    }

    public List<Veggies> createVeggies() {
        return ChicagoPizzaVeggies;
    }

    public Pepperoni createPepperoni() {
        return slicedPepperoni;
    }

    public Clams createClam() {
        return frozenClams;
    }
}