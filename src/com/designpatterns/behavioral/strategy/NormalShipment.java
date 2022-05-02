package com.designpatterns.behavioral.strategy;

public class NormalShipment implements Shipment {

    @Override
    public double calcular(double price) {
        return price * 0.05;
    }
}
