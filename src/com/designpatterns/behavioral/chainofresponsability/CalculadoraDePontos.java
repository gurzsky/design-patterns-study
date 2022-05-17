package com.designpatterns.behavioral.chainofresponsability;

public class CalculadoraDePontos {

    public int calcularPontosDoPedido(Pedido pedido, int dia) {

        Pontos70Reais pontos70Reais = new Pontos70Reais();
        Pontos40Reais pontos40Reais = new Pontos40Reais();
        Pontos20Reais pontos20Reais = new Pontos20Reais();
        NenhumPonto nenhumPonto = new NenhumPonto();

        pontos70Reais.setProximo(pontos40Reais);
        pontos40Reais.setProximo(pontos20Reais);
        pontos20Reais.setProximo(nenhumPonto);

        if (dia >= 16 && dia <=31)
            return pontos70Reais.calcularPontos(pedido) * 2;

        return pontos70Reais.calcularPontos(pedido);
    }
}
