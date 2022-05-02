package com.designpatterns.structural.adapter;

public interface Gateway {

    public void setPrice(float price);
    public void setParcel(int parcel);
    public void setCardNumber(String cardNumber);
    public void setCvv(String cvv);
    public boolean validateCard();
    public boolean makePayment();
}
