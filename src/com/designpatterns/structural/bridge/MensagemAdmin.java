package com.designpatterns.structural.bridge;

public class MensagemAdmin extends Mensagem{
    public MensagemAdmin(CanalDeEnvioInterface canal) {
        super(canal);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem enviada pelo Admin");
        this.canal.enviarMensagem(this.mensagem, this.assunto);
    }
}
