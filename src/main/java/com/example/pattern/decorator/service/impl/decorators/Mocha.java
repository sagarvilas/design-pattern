package com.example.pattern.decorator.service.impl.decorators;

import org.springframework.stereotype.Service;

@Service
public class Mocha extends BeverageDecorator {

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
