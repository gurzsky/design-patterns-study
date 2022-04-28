package com.designpatterns.creational.factorymethod;

public class BankCaixaMain {

    public static void main(String[] args) throws Exception {
        BankSlipSimpleFactory bankSlipSimpleFactory = new BankSlipSimpleFactory();
        BankCaixa bankCaixa = new BankCaixa(bankSlipSimpleFactory);

        bankCaixa.generateBankSlip(10, 100);
        bankCaixa.generateBankSlip(30, 100);
        bankCaixa.generateBankSlip(60, 100);
    }
}
