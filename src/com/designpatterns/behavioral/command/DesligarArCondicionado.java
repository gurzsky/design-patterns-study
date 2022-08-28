package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.Fabricante.ArCondicionado;

public class DesligarArCondicionado implements Command{

    private ArCondicionado arCondicionado;

    public DesligarArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void executar() {
        this.arCondicionado.desligar();
        this.arCondicionado.imprimeObjeto();
    }

    @Override
    public void desfazer() {
        this.arCondicionado.ligar();
        this.arCondicionado.imprimeObjeto();
    }
}
