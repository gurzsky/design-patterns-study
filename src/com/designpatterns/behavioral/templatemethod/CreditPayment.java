package com.designpatterns.behavioral.templatemethod;

public class CreditPayment extends Payment{

    public CreditPayment(float price, Gateway gateway) {
        super(price, gateway);
    }

    public float calculateTax() {
        return (float) (this.price * 0.5);
    }

    @Override
    public float calculateDiscount() {
        if (this.price > 300)
            return (float) (this.price * 0.02);

        return 0;
    }
}
