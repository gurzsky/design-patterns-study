package com.designpatterns.structural.bridge;

public class Email implements CanalDeEnvioInterface {
    @Override
    public void enviarMensagem(String assunto, String mensagem) {
        System.out.println("Mensagem enviada por email");
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}
