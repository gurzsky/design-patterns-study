package com.designpatterns.creational.factorymethod.brasil;

import com.designpatterns.creational.factorymethod.BankSlip;

public class BankBrasilSlipThirtyDays extends BankSlip {
    public BankBrasilSlipThirtyDays(float price) {
        super(price);
        this.tax = 0.05f;
        this.discount = 0.2f;
        this.fees = 0.05f;
    }
}
