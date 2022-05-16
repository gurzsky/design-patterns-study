package com.designpatterns.behavioral.chainofresponsability;

public class CalculadoraDePontos {

    public int calcularPontosDoPedido(Pedido pedido, int dia) {

        int pontos;
        if (pedido.getValor() >= 70) {
            pontos = (int) (pedido.getValor() / 5);
        } else if (pedido.getValor() >= 40) {
            pontos = (int) (pedido.getValor() / 7);
        } else if (pedido.getValor() >= 20) {
            pontos = (int) (pedido.getValor() / 10);
        } else {
            return 0;
        }

        if (dia >= 16 && dia <=31)
            return pontos * 2;

        return pontos;
    }
}
