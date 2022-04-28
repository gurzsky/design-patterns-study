package com.designpatterns.creational.factorymethod;

public class BankSlipSimpleFactory {

    public BankSlip  createBankSlip(int dueDate, float price) throws Exception {
        BankSlip bankSlip;
        switch (dueDate) {
            case 10:
                bankSlip = new BankCaixaSlipTenDays(price);
                break;
            case 30:
                bankSlip = new BankCaixaSlipThirtyDays(price);
                break;
            case 60:
                bankSlip = new BankCaixaSlipSixtyDays(price);
                break;
            default:
                throw new Exception("Due Date not available");
        }
        return bankSlip;
    }
}
