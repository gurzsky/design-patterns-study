package com.designpatterns.structural.decorator;

public class WholeWheatDough extends AddOnsDecorator {
    public WholeWheatDough(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " - Whole Wheat Dough";
    }

    @Override
    public float getPrice() {
        return pizza.getPrice() + 5.0f;
    }
}
