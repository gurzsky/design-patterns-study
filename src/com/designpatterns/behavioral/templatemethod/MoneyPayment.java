package com.designpatterns.behavioral.templatemethod;

public class MoneyPayment extends Payment {

    public MoneyPayment(float price, Gateway gateway) {
        super(price, gateway);
    }

    @Override
    public float calculateDiscount() {
        return 0;
    }
}
