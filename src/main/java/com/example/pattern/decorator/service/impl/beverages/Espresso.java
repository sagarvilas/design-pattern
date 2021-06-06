package com.example.pattern.decorator.service.impl.beverages;

import org.springframework.stereotype.Service;

@Service
public class Espresso extends AbstractBeverage{

    public Espresso(){
        this.description = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.55;
    }
}
