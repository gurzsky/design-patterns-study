package com.designpatterns.creational.factorymethod.caixa;

import com.designpatterns.creational.factorymethod.BankSlip;

public class BankCaixaSlipSixtyDays extends BankSlip {

    public BankCaixaSlipSixtyDays(float price) {
        super(price);
        this.tax = 0.06f;
        this.discount = 0.3f;
        this.fees = 0.15f;
    }
}
