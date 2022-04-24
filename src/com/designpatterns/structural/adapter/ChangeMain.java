package com.designpatterns.structural.adapter;

import com.designpatterns.structural.adapter.Charge;
import com.designpatterns.structural.adapter.EasyPaymentAdapter;
import com.designpatterns.structural.adapter.TopPaymentAdapter;
import com.designpatterns.structural.adapter.payment.TopPayment;

public class ChangeMain {

    public static void main(String[] args) {

        EasyPaymentAdapter easyPaymentAdapter = new EasyPaymentAdapter();

        TopPayment topPayment = new TopPayment();
        TopPaymentAdapter topPaymentAdapter = new TopPaymentAdapter(topPayment);

        Charge charge = new Charge(easyPaymentAdapter);

        charge.setPrice(100);
        charge.setParcel(3);
        charge.setCardNumber("1234567890");
        charge.setCvv("123");

        if (charge.makePayment())
            System.out.println("Success");
        else
            System.out.println("Fail");

        charge = new Charge(topPaymentAdapter);

        charge.setPrice(100);
        charge.setParcel(3);
        charge.setCardNumber("1234567890");
        charge.setCvv("123");

        if (charge.makePayment())
            System.out.println("Success");
        else
            System.out.println("Fail");
    }
}
