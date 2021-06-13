package com.example.pattern.decorator.service.impl.decorators;

import org.springframework.stereotype.Service;

@Service
public class Milk extends BeverageDecorator {


    @Override
    public double getCost() {
        return this.beverage.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }
}
