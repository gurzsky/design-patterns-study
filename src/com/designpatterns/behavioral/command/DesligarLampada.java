package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.Fabricante.Lampada;

public class DesligarLampada implements Command{

    private Lampada lampada;

    public DesligarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        this.lampada.desligar();
        this.lampada.imprimeObjeto();
    }

    @Override
    public void desfazer() {
        this.lampada.ligar();
        this.lampada.imprimeObjeto();
    }
}
