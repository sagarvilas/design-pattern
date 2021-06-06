package com.example.pattern.decorator.service.impl.decorators;

import com.example.pattern.decorator.service.api.Beverage;

public class Sugar extends BeverageDecorator {

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Sugar";
    }
}
