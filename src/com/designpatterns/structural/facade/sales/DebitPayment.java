package com.designpatterns.structural.facade.sales;

public class DebitPayment extends Payment {

    public DebitPayment(Order order) {
        super(order);
    }

    @Override
    public boolean makePayment() {

        return this.order.getPrice() > 0;
    }
}
