package com.designpatterns.behavioral.strategy;

public class ExpressShipment implements Shipment {
    @Override
    public double calcular(double price) {
        return price * 0.1;
    }
}
