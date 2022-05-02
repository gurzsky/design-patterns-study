package com.designpatterns.structural.facade.sales;

public class CreditPayment extends Payment {
    public CreditPayment(Order order) {
        super(order);
    }

    @Override
    public boolean makePayment() {

        return this.order.getPrice() > 0;
    }
}
