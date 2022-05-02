package com.designpatterns.creational.abstractfactory.caixa;

import com.designpatterns.creational.abstractfactory.Juros;

public class CaixaJuros implements Juros {
    @Override
    public float getJuros() {
        return 0.02f;
    }
}
