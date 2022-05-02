package com.designpatterns.creational.factorymethod.caixa;

import com.designpatterns.creational.factorymethod.Bank;
import com.designpatterns.creational.factorymethod.BankSlip;

public class BankCaixa extends Bank {

    @Override
    public BankSlip createBankSlip(int dueDate, float price) throws Exception {
        BankSlip bankSlip;
        switch (dueDate) {
            case 10:
                return new BankCaixaSlipTenDays(price);
            case 30:
                return new BankCaixaSlipThirtyDays(price);
            case 60:
                return new BankCaixaSlipSixtyDays(price);
            default:
                throw new Exception("Due Date not available");
        }
    }
}
