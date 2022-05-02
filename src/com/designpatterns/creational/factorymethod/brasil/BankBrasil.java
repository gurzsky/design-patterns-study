package com.designpatterns.creational.factorymethod.brasil;

import com.designpatterns.creational.factorymethod.Bank;
import com.designpatterns.creational.factorymethod.BankSlip;
import com.designpatterns.creational.factorymethod.caixa.BankCaixaSlipSixtyDays;
import com.designpatterns.creational.factorymethod.caixa.BankCaixaSlipTenDays;
import com.designpatterns.creational.factorymethod.caixa.BankCaixaSlipThirtyDays;

public class BankBrasil extends Bank {

    @Override
    public BankSlip createBankSlip(int dueDate, float price) throws Exception {
        BankSlip bankSlip;
        switch (dueDate) {
            case 10:
                return new BankBrasilSlipTenDays(price);
            case 30:
                return new BankBrasilSlipThirtyDays(price);
            case 60:
                return new BankBrasilSlipSixtyDays(price);
            default:
                throw new Exception("Due Date not available");
        }
    }
}
