package com.designpatterns.structural.adapter;

import com.designpatterns.structural.adapter.payment.TopPayment;

public class TopPaymentAdapter implements Gateway {

    private TopPayment topPayment;
    private String cvv = null;
    private String cardNumber = null;

    public TopPaymentAdapter(TopPayment topPayment) {
        this.topPayment = topPayment;
    }

    @Override
    public void setPrice(float price) {
        topPayment.setPrice(price);
    }

    @Override
    public void setParcel(int parcel) {
        topPayment.setParcel(parcel);
    }

    @Override
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        if (this.cvv != null) {
            this.topPayment.setCardNumber(this.cardNumber, this.cvv);
        }
    }

    @Override
    public void setCvv(String cvv) {
        this.cvv = cvv;
        if (this.cardNumber != null) {
            this.topPayment.setCardNumber(this.cardNumber, this.cvv);
        }
    }

    @Override
    public boolean validateCard() {
        return true;
    }

    @Override
    public boolean makePayment() {
        return this.topPayment.makePayment();
    }
}
