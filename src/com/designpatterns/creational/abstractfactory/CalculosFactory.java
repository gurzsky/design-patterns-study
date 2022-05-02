package com.designpatterns.creational.abstractfactory;

public interface CalculosFactory {

    public Juros criarJuros();
    public Desconto criarDesconto();
    public Multa criarMulta();
}
