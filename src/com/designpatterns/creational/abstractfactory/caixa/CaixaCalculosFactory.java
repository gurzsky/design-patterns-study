package com.designpatterns.creational.abstractfactory.caixa;

import com.designpatterns.creational.abstractfactory.CalculosFactory;
import com.designpatterns.creational.abstractfactory.Desconto;
import com.designpatterns.creational.abstractfactory.Juros;
import com.designpatterns.creational.abstractfactory.Multa;
import com.designpatterns.creational.abstractfactory.bancodobrasil.BBDesconto;
import com.designpatterns.creational.abstractfactory.bancodobrasil.BBJuros;
import com.designpatterns.creational.abstractfactory.bancodobrasil.BBMulta;

public class CaixaCalculosFactory implements CalculosFactory {
    @Override
    public Juros criarJuros() {
        return new CaixaJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new CaixaDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new CaixaMulta();
    }
}
