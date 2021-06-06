package com.example.pattern.decorator.service.impl.decorators;

import com.example.pattern.decorator.service.api.Beverage;
import com.example.pattern.decorator.service.impl.beverages.AbstractBeverage;

public abstract class BeverageDecorator extends AbstractBeverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();
}
