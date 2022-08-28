package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.Fabricante.ArCondicionado;

public class MudarTemperaturaArCondicionado implements Command{

    private ArCondicionado arCondicionado;
    private int temperatura;
    private int temperaturaAnterior;

    public MudarTemperaturaArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
        this.temperatura  = arCondicionado.getTemperatura();
    }

    public void setTemperatura(int temperatura) {
        this.temperaturaAnterior = this.temperatura;
        this.temperatura = temperatura;
    }

    @Override
    public void executar() {
        this.arCondicionado.setTemperatura(this.temperatura);
        this.arCondicionado.imprimeObjeto();
    }

    @Override
    public void desfazer() {
        this.arCondicionado.setTemperatura(this.temperaturaAnterior);
        this.arCondicionado.imprimeObjeto();
    }
}
