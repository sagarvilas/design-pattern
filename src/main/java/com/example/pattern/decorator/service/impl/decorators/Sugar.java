package com.example.pattern.decorator.service.impl.decorators;

import org.springframework.stereotype.Service;

@Service
public class Sugar extends BeverageDecorator {

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Sugar";
    }
}
