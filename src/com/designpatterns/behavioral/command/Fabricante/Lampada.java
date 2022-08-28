package com.designpatterns.behavioral.command.Fabricante;

public class Lampada {

    private String identificacao;
    private boolean estado;

    public Lampada(String identificacao, boolean estado) {
        this.identificacao = identificacao;
        this.estado = estado;
    }

    public void ligar() {
        this.estado = true;
    }

    public void desligar() {
        this.estado = false;
    }

    public String getIdentificacao() {
        return this.identificacao;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void imprimeObjeto() {
        String identificacao = "";
        identificacao = "O objeto " + this.identificacao + " está ";
        identificacao += this.estado ? "Ligado." : "Desligado.";
        identificacao += "\n";
        System.out.println(identificacao);
    }
}
