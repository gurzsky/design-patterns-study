package com.designpatterns.creational.abstractfactory.bancodobrasil;

import com.designpatterns.creational.abstractfactory.Desconto;

public class BBDesconto implements Desconto {
    @Override
    public float getDesconto() {
        return 0.05f;
    }
}
