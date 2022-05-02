package com.designpatterns.structural.adapter.payment;

public class TopPayment {

    private float price;
    private int parcel;
    private String cardNumber;
    private String cvv;

    public void setPrice(float price) {
        this.price = price;
    }

    public void setParcel(int parcel) {
        this.parcel = parcel;
    }

    public void setCardNumber(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public boolean makePayment() {
        System.out.println("Payment ok - TopPayment");
        return true;
    }
}
