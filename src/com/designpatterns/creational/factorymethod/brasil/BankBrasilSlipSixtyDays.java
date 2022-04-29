package com.designpatterns.creational.factorymethod.brasil;

import com.designpatterns.creational.factorymethod.BankSlip;

public class BankBrasilSlipSixtyDays extends BankSlip {

    public BankBrasilSlipSixtyDays(float price) {
        super(price);
        this.tax = 0.10f;
        this.discount = 0.0f;
        this.fees = 0.20f;
    }
}
