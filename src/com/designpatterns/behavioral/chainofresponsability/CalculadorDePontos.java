package com.designpatterns.behavioral.chainofresponsability;

public interface CalculadorDePontos {

    public int calcularPontos(Pedido pedido);
    public void setProximo(CalculadorDePontos next);
}
