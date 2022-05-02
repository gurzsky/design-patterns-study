package com.designpatterns.creational.abstractfactory.bancodobrasil;

import com.designpatterns.creational.abstractfactory.Multa;

public class BBMulta implements Multa {
    @Override
    public float getMulta() {
        return 0.02f;
    }
}
