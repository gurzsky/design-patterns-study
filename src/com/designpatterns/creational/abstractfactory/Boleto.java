package com.designpatterns.creational.abstractfactory;

abstract public class Boleto {

    protected float price;
    protected float tax;
    protected float discount;
    protected float fees;

    public Boleto(float price) {
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
