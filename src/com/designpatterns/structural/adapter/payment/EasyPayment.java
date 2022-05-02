package com.designpatterns.structural.adapter.payment;

public class EasyPayment {

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

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean validateCard() {
        if (this.cardNumber != "" && this.cvv != "" && this.cvv.length() == 3)
            return true;

        return false;
    }

    public boolean makePayment() {
        System.out.println("Payment ok - EasyPayment");
        return true;
    }
}
