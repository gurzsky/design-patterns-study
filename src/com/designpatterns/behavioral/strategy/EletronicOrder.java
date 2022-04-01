package com.designpatterns.behavioral.strategy;

public class EletronicOrder extends Order {

    private String sectorName;

    public EletronicOrder(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }
}
