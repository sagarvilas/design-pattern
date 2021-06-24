package com.example.pattern.factory.service.api.pizza;

import com.example.pattern.factory.service.api.ingredient.*;

import java.util.List;

public abstract class Pizza {
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected List<Veggies> veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    protected void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    protected String getName() {
        return name;
    }


    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.size(); i++) {
                result.append(veggies.get(i));
                if (i < veggies.size() - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        result.append("Pizza ID=").append(this.hashCode());
        return result.toString();
    }
}