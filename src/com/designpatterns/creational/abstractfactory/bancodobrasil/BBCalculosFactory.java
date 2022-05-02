package com.designpatterns.creational.abstractfactory.bancodobrasil;

import com.designpatterns.creational.abstractfactory.CalculosFactory;
import com.designpatterns.creational.abstractfactory.Desconto;
import com.designpatterns.creational.abstractfactory.Juros;
import com.designpatterns.creational.abstractfactory.Multa;

public class BBCalculosFactory implements CalculosFactory {
    @Override
    public Juros criarJuros() {
        return new BBJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new BBDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new BBMulta();
    }
}
