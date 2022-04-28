package com.designpatterns.creational.factorymethod;

public class BankCaixa {

    private BankSlipSimpleFactory bankSlipSimpleFactory;
    public BankCaixa(BankSlipSimpleFactory bankSlipSimpleFactory) {
        this.bankSlipSimpleFactory = bankSlipSimpleFactory;
    }

    public BankSlip generateBankSlip(int dueDate, float price) throws Exception {
        BankSlip bankSlip = bankSlipSimpleFactory.createBankSlip(dueDate, price);

        System.out.println("BankSlip successful created with value of " + price);
        System.out.println("Tax: " + bankSlip.taxCalculate());
        System.out.println("Discount: " + bankSlip.discountCalculate());
        System.out.println("Fees: " + bankSlip.feesCalculate());

        return bankSlip;
    }
}
