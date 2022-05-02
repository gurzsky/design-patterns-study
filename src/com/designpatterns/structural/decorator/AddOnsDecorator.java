package com.designpatterns.structural.decorator;

public abstract class AddOnsDecorator extends Pizza {

    protected Pizza pizza;

    public AddOnsDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract float getPrice();
}
