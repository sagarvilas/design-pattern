package com.example.pattern.decorator.service.impl.decorators;

import com.example.pattern.decorator.service.api.Beverage;
import org.springframework.stereotype.Service;

@Service
public class Milk extends BeverageDecorator {

    public Beverage setBeverage(Beverage beverage){
        this.beverage = beverage;
        return this;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }
}
