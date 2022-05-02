package com.designpatterns.creational.factorymethod.caixa;

import com.designpatterns.creational.factorymethod.BankSlip;

public class BankCaixaSlipTenDays extends BankSlip {

    public BankCaixaSlipTenDays(float price) {
        super(price);
        this.tax = 0.02f;
        this.discount = 0.1f;
        this.fees = 0.05f;
    }
}
