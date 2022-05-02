package com.designpatterns.structural.decorator;

public class CheesePizza extends Pizza{

    public CheesePizza() {
        this.description = "Cheese pizza";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public float getPrice() {
        return 22;
    }
}
