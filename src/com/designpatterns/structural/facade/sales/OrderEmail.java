package com.designpatterns.structural.facade.sales;

public class OrderEmail {

    private Order order;

    public OrderEmail(Order order) {
        this.order = order;
    }

    public void sendEmail(String message) {
        System.out.println("Email sent to " + this.order.getConsumer().getEmail());
        System.out.println("Message " + message);
    }
}
