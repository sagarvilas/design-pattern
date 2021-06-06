package com.example.pattern.decorator.service.impl;

import org.springframework.stereotype.Service;

@Service
public class Decaf extends AbstractBeverage {

    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double getCost() {
        return 0.95;
    }
}
