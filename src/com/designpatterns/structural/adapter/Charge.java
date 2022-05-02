package com.designpatterns.structural.adapter;

public class Charge {

    private Gateway gateway;

    public Charge(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setPrice(float price) {
        this.gateway.setPrice(price);
    }

    public void setParcel(int parcel) {
        this.gateway.setParcel(parcel);
    }

    public void setCardNumber(String cardNumber) {
        this.gateway.setCardNumber(cardNumber);
    }

    public void setCvv(String cvv) {
        this.gateway.setCardNumber(cvv);
    }

    public boolean makePayment() {
        this.gateway.makePayment();
        return true;
    }
}
