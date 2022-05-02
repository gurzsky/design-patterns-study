package com.designpatterns.creational.abstractfactory.caixa;

import com.designpatterns.creational.abstractfactory.Multa;

public class CaixaMulta implements Multa {
    @Override
    public float getMulta() {
        return 0.05f;
    }
}
