package com.example.pattern.decorator.service.impl.beverages;

import org.springframework.stereotype.Service;

@Service
public class HouseBlend extends AbstractBeverage {

    public HouseBlend() {
        this.description = "House Blend";
    }

    @Override
    public double getCost() {
        return 2.10;
    }
}
