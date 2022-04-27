package com.designpatterns.structural.facade.sales;

import com.designpatterns.structural.facade.Consumer;
import com.designpatterns.structural.facade.Product;

public class SalesFacade {

    private Order order;
    private Payment payment;
    private OrderEmail orderEmail;

    public SalesFacade(Consumer consumer) {
        this.order = new Order(consumer);
        this.orderEmail = new OrderEmail(order);
    }

    public void addProduct(Product product) {
        this.order.addProduct(product);
    }

    public void creditOrder() {
        this.payment = new CreditPayment(this.order);
        if (this.payment.makePayment())
            this.orderEmail.sendEmail("Credit Payment successful");
        else
            this.orderEmail.sendEmail("Credit Payment fail");
    }

    public void debitOrder() {
        this.payment = new DebitPayment(this.order);
        if (this.payment.makePayment())
            this.orderEmail.sendEmail("Debit Payment successful");
        else
            this.orderEmail.sendEmail("Debit Payment fail");
    }
}
