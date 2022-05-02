package com.designpatterns.behavioral.strategy;

public class FurnitureOrder extends Order {

    private String sectorName;

    public FurnitureOrder(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }
}
