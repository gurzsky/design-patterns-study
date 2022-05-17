package com.designpatterns.behavioral.chainofresponsability;

public class NenhumPonto implements CalculadorDePontos {

    private CalculadorDePontos next;

    @Override
    public int calcularPontos(Pedido pedido) {
        return 0;
    }

    @Override
    public void setProximo(CalculadorDePontos next) {

    }
}
