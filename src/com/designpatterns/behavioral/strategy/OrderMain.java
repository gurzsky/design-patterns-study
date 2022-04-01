package com.designpatterns.behavioral.strategy;

public class OrderMain {

    public static void main(String[] args) {
        EletronicOrder normalShipmentE = new EletronicOrder("eletronic order");
        normalShipmentE.setPrice(100);
        normalShipmentE.setShipmentType(new NormalShipment());
        double shipment = normalShipmentE.shipmentCalcule();
        System.out.println(normalShipmentE.getSectorName()  + " - normal shipment " + shipment);

        EletronicOrder expressShipmentE = new EletronicOrder("eletronic order");
        expressShipmentE.setPrice(100);
        expressShipmentE.setShipmentType(new ExpressShipment());
        shipment = expressShipmentE.shipmentCalcule();
        System.out.println(expressShipmentE.getSectorName() + " - express shipment " + shipment);

        FurnitureOrder normalShipmentF = new FurnitureOrder("furniture order");
        normalShipmentF.setPrice(200);
        normalShipmentF.setShipmentType(new NormalShipment());
        shipment = normalShipmentF.shipmentCalcule();
        System.out.println(normalShipmentF.getSectorName() + " - normal shipment " + shipment);

        FurnitureOrder expressShipmentF = new FurnitureOrder("furniture order");
        expressShipmentF.setPrice(200);
        expressShipmentF.setShipmentType(new ExpressShipment());
        shipment = expressShipmentF.shipmentCalcule();
        System.out.println(expressShipmentF.getSectorName() + " - express shipment " + shipment);
    }
}
