package com.designpatterns.behavioral.templatemethod;

public abstract class Payment {

    protected float price;
    protected Gateway gateway;

    public Payment(float price, Gateway gateway) {
        this.price = price;
        this.gateway = gateway;
    }

    public float calculateTax() {
        return 0;
    }

    public abstract float calculateDiscount();

    // this is the Template Method
    public boolean makeCharge() {
        float finalCharge = this.price + this.calculateTax() - this.calculateDiscount();
        return this.gateway.cobrar(finalCharge);
    }
}
