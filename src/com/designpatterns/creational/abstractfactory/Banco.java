package com.designpatterns.creational.abstractfactory;

public class Banco {

    public Boleto gerarBoleto(float valor, CalculosFactory calculosFactory) throws Exception {
        Boleto boleto = new Boleto(valor, calculosFactory);

        System.out.println("Boleto criado com sucesso " + valor);
        System.out.println("Juros: " + boleto.calcularJuros());
        System.out.println("Desconto: " + boleto.calcularDesconto());
        System.out.println("Multa: " + boleto.calcularMulta());

        return boleto;
    }
}
