package com.example.pattern.decorator.service.impl.decorators;

import com.example.pattern.decorator.service.api.Beverage;

public class Mocha extends BeverageDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
