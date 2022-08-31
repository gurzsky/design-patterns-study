package com.designpatterns.structural.bridge;

public class Cliente {

    public static void main(String[] args) {
        CanalDeEnvioInterface canalEnvio = new Email();

        Mensagem mensagem = new MensagemAdmin(canalEnvio);
        mensagem.setMensagem("Ola admim");
        mensagem.setAssunto("Primeira mensagem");
        mensagem.enviar();

        mensagem = new MensagemUsuario(canalEnvio);
        mensagem.setMensagem("Ola usuario");
        mensagem.setAssunto("Primeira mensagem");
        mensagem.enviar();

        canalEnvio = new SMS();

        mensagem = new MensagemAdmin(canalEnvio);
        mensagem.setMensagem("Ola admim");
        mensagem.setAssunto("Primeira mensagem");
        mensagem.enviar();

        mensagem = new MensagemUsuario(canalEnvio);
        mensagem.setMensagem("Ola usuario");
        mensagem.setAssunto("Primeira mensagem");
        mensagem.enviar();

    }
}
