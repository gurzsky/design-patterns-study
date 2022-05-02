package com.designpatterns.creational.abstractfactory.caixa;

import com.designpatterns.creational.abstractfactory.Desconto;

public class CaixaDesconto implements Desconto {
    @Override
    public float getDesconto() {
        return 0.10f;
    }
}
