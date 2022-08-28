package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.Fabricante.ArCondicionado;
import com.designpatterns.behavioral.command.Fabricante.Lampada;

public class LigarArCondicionado implements Command{

    private ArCondicionado arCondicionado;

    public LigarArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void executar() {
        this.arCondicionado.ligar();
        this.arCondicionado.imprimeObjeto();
    }

    @Override
    public void desfazer() {
        this.arCondicionado.desligar();
        this.arCondicionado.imprimeObjeto();
    }
}
