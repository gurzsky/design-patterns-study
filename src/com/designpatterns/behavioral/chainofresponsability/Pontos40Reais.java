package com.designpatterns.behavioral.chainofresponsability;

public class Pontos40Reais implements CalculadorDePontos {

    private CalculadorDePontos next;

    @Override
    public int calcularPontos(Pedido pedido) {
        if (pedido.getValor() >= 40) {
            return (int) (pedido.getValor() / 7);
        }
        return this.next.calcularPontos(pedido);
    }

    @Override
    public void setProximo(CalculadorDePontos next) {
        this.next = next;
    }
}
