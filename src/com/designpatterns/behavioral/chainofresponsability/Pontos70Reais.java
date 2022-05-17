package com.designpatterns.behavioral.chainofresponsability;

public class Pontos70Reais implements CalculadorDePontos {

    private CalculadorDePontos next;

    @Override
    public int calcularPontos(Pedido pedido) {
        if (pedido.getValor() >= 70) {
            return (int) (pedido.getValor() / 5);
        }
        return this.next.calcularPontos(pedido);
    }

    @Override
    public void setProximo(CalculadorDePontos next) {
        this.next = next;
    }
}
