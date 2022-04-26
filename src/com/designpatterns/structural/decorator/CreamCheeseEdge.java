package com.designpatterns.structural.decorator;

public class CreamCheeseEdge extends AddOnsDecorator {
    public CreamCheeseEdge(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " - Cream Cheese Edge";
    }

    @Override
    public float getPrice() {
        return pizza.getPrice() + 8.5f;
    }
}
