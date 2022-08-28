package com.designpatterns.behavioral.command.Fabricante;

public class ArCondicionado {

    private String identificacao;
    private boolean estado;
    private int temperatura;

    public ArCondicionado(String identificacao, boolean estado, int temperatura) {
        this.identificacao = identificacao;
        this.estado = estado;
        this.temperatura = temperatura;
    }

    public void ligar() {
        this.estado = true;
    }

    public void desligar() {
        this.estado = false;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void imprimeObjeto() {
        String identificacao = "";
        identificacao = "O objeto " + this.identificacao + " está ";
        identificacao += this.estado ? "Ligado." : "Desligado.";
        identificacao += this.estado ? "a " + this.temperatura + " graus celsius." : "";
        identificacao += "\n";
        System.out.println(identificacao);
    }


}
