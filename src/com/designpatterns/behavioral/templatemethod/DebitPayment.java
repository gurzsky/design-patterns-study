package com.designpatterns.behavioral.templatemethod;

public class DebitPayment extends Payment{

    public DebitPayment(float price, Gateway gateway) {
        super(price, gateway);
    }

    public float calculateTax() {
        return 4;
    }

    @Override
    public float calculateDiscount() {
        return (float) (this.price * 0.05);
    }
}
