package com.designpatterns.creational.factorymethod.brasil;

import com.designpatterns.creational.factorymethod.BankSlip;

public class BankBrasilSlipTenDays extends BankSlip {

    public BankBrasilSlipTenDays(float price) {
        super(price);
        this.tax = 0.03f;
        this.discount = 0.5f;
        this.fees = 0.02f;
    }
}
