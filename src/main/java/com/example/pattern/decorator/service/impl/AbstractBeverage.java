package com.example.pattern.decorator.service.impl;

import com.example.pattern.decorator.service.api.Beverage;

public abstract class AbstractBeverage implements Beverage {

    String description = "Unknown beverage";

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public abstract double getCost();
}
