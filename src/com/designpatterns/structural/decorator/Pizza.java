package com.designpatterns.structural.decorator;

public abstract class Pizza {

    protected String description = "Undefine description";
    protected float price;

    public abstract String getDescription();
    public abstract float getPrice();
}
