package com.designpatterns.structural.decorator;

public class PepperoniPizza extends Pizza{

    public PepperoniPizza() {
        this.description = "Pepperoni pizza";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public float getPrice() {
        return 25;
    }
}
