package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.Fabricante.Lampada;

public class LigarLampada implements Command{

    private Lampada lampada;

    public LigarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        this.lampada.ligar();
        this.lampada.imprimeObjeto();
    }

    @Override
    public void desfazer() {
        this.lampada.desligar();
        this.lampada.imprimeObjeto();
    }
}
