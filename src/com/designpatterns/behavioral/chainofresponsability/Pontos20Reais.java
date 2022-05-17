package com.designpatterns.behavioral.chainofresponsability;

public class Pontos20Reais implements CalculadorDePontos {

    private CalculadorDePontos next;

    @Override
    public int calcularPontos(Pedido pedido) {
        if (pedido.getValor() >= 20) {
            return (int) (pedido.getValor() / 10);
        }
        return this.next.calcularPontos(pedido);
    }

    @Override
    public void setProximo(CalculadorDePontos next) {
        this.next = next;
    }
}
