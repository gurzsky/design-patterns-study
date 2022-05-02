package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.brasil.BankBrasil;
import com.designpatterns.creational.factorymethod.caixa.BankCaixa;

public class BankMain {

    public static void main(String[] args) throws Exception {
        BankCaixa bankCaixa = new BankCaixa();
        bankCaixa.generateBankSlip(10, 100);
        bankCaixa.generateBankSlip(30, 100);
        bankCaixa.generateBankSlip(60, 100);

        BankBrasil bankBrasil = new BankBrasil();
        bankBrasil.generateBankSlip(10, 100);
        bankBrasil.generateBankSlip(30, 100);
        bankBrasil.generateBankSlip(60, 100);
    }
}
