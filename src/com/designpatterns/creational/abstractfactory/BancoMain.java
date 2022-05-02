package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.bancodobrasil.BBCalculosFactory;
import com.designpatterns.creational.abstractfactory.caixa.CaixaCalculosFactory;

public class BancoMain {

    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();

        CalculosFactory caixaCalculosFactory = new CaixaCalculosFactory();
        banco.gerarBoleto(100, caixaCalculosFactory);

        CalculosFactory bbCalculosFactory = new BBCalculosFactory();
        banco.gerarBoleto(100, bbCalculosFactory);
    }
}
