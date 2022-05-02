package com.designpatterns.creational.abstractfactory;
 public class Boleto {

    protected float valor;
    protected Juros juros;
    protected Desconto desconto;
    protected Multa multa;

    public Boleto(float valor, CalculosFactory calculosFactory) {
        this.valor = valor;
        this.juros = calculosFactory.criarJuros();
        this.desconto = calculosFactory.criarDesconto();
        this.multa = calculosFactory.criarMulta();
    }

    public float calcularJuros() {
        return this.valor * this.juros.getJuros();
    }

    public float calcularDesconto() {
        return this.valor * this.desconto.getDesconto();
    }

    public float calcularMulta() {
        return this.valor * this.multa.getMulta();
    }
}
