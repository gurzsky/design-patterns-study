package com.designpatterns.creational.abstractfactory.bancodobrasil;

import com.designpatterns.creational.abstractfactory.Juros;

public class BBJuros implements Juros {

    @Override
    public float getJuros() {
        return 0.03f;
    }
}
