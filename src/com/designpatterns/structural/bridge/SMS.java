package com.designpatterns.structural.bridge;

public class SMS implements CanalDeEnvioInterface{
    @Override
    public void enviarMensagem(String assunto, String mensagem) {
        System.out.println("Mensagem enviada por SMS");
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}
