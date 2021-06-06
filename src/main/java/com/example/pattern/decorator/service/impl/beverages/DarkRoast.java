package com.example.pattern.decorator.service.impl.beverages;

import org.springframework.stereotype.Service;

@Service
public class DarkRoast extends AbstractBeverage{

    public DarkRoast(){
        this.description = "Dark Roast";
    }

    @Override
    public double getCost() {
        return 1.80;
    }
}
