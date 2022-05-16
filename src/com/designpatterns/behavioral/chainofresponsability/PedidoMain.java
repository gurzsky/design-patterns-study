package com.designpatterns.behavioral.chainofresponsability;

public class PedidoMain {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        CalculadoraDePontos calculadoraDePontos = new CalculadoraDePontos();

        pedido.setValor(21);
        System.out.println("Dia 15 " + calculadoraDePontos.calcularPontosDoPedido(pedido, 15) + " pontos");
        System.out.println("Dia 16 " + calculadoraDePontos.calcularPontosDoPedido(pedido, 16) + " pontos");

        pedido.setValor(100);
        System.out.println("Dia 15 " + calculadoraDePontos.calcularPontosDoPedido(pedido, 15) + " pontos");
        System.out.println("Dia 16 " + calculadoraDePontos.calcularPontosDoPedido(pedido, 16) + " pontos");

    }
}
