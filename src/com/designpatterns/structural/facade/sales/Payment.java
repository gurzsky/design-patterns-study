package com.designpatterns.structural.facade.sales;

abstract public class Payment {

    protected Order order;

    public Payment(Order order) {
        this.order = order;
    }

    abstract public boolean makePayment();
}
