package com.designpatterns.structural.bridge;

public class MensagemUsuario extends Mensagem{
    public MensagemUsuario(CanalDeEnvioInterface canal) {
        super(canal);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem enviada pelo Usuario");
        this.canal.enviarMensagem(this.mensagem, this.assunto);
    }
}
