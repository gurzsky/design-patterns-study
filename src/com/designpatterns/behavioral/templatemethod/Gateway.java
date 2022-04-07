package com.designpatterns.behavioral.templatemethod;

public class Gateway {

    public boolean cobrar(float finalCharge) {
        System.out.println(finalCharge);
        return true;
    }
}
