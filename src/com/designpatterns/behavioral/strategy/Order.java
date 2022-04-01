package com.designpatterns.behavioral.strategy;

public abstract class Order {

    private Shipment shipmentType;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setShipmentType(Shipment shipmentType) {
        this.shipmentType = shipmentType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double shipmentCalcule() {
        return shipmentType.calcular(this.price);
    }
}
