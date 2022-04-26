package com.designpatterns.structural.decorator;

public class ChickenPizza extends Pizza{

    public ChickenPizza() {
        this.description = "Chicken pizza";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public float getPrice() {
        return 19;
    }
}
