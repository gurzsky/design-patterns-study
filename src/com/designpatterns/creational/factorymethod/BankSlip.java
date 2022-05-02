package com.designpatterns.creational.factorymethod;

abstract public class BankSlip {

    protected float price;
    protected float tax;
    protected float discount;
    protected float fees;

    public BankSlip(float price) {
        this.price = price;
    }

    public float taxCalculate() {
        return this.price * this.tax;
    }

    public float discountCalculate() {
        return this.price * this.discount;
    }

    public float feesCalculate() {
        return this.price * this.fees;
    }
}
