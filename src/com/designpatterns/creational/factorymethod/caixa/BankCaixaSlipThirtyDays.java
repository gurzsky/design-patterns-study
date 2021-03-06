package com.designpatterns.creational.factorymethod.caixa;

import com.designpatterns.creational.factorymethod.BankSlip;

public class BankCaixaSlipThirtyDays extends BankSlip {
    public BankCaixaSlipThirtyDays(float price) {
        super(price);
        this.tax = 0.04f;
        this.discount = 0.2f;
        this.fees = 0.10f;
    }
}
