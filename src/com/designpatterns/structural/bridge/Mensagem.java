package com.designpatterns.structural.bridge;

public abstract class Mensagem {

    protected String assunto;
    protected String mensagem;
    protected CanalDeEnvioInterface canal;

    public Mensagem(CanalDeEnvioInterface canal) {
        this.canal = canal;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    abstract public void enviar();
}
