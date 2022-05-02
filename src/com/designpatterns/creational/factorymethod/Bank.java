package com.designpatterns.creational.factorymethod;

abstract public class Bank {

    public BankSlip generateBankSlip(int dueDate, float price) throws Exception {
        BankSlip bankSlip = this.createBankSlip(dueDate, price);

        System.out.println("BankSlip successful created with value of " + price);
        System.out.println("Tax: " + bankSlip.taxCalculate());
        System.out.println("Discount: " + bankSlip.discountCalculate());
        System.out.println("Fees: " + bankSlip.feesCalculate());

        return bankSlip;
    }
    // createBankSlip is the Factory Method
   abstract public BankSlip createBankSlip(int dueDate, float price) throws Exception;

}
