package com.designpatterns.behavioral.templatemethod;

public class PaymentMain {

    public static void main(String[] args) {
        float price = 1000;
        Gateway gateway = new Gateway();

        System.out.println("Credit");
        var creditPayment = new CreditPayment(price, gateway);
        creditPayment.makeCharge();

        System.out.println("Debit");
        var debitPayment = new DebitPayment(price, gateway);
        debitPayment.makeCharge();

        System.out.println("Money");
        var moneyPayment = new MoneyPayment(price, gateway);
        moneyPayment.makeCharge();
    }
}
