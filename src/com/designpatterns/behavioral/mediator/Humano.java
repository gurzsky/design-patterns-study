package com.designpatterns.behavioral.mediator;

public class Humano extends Usuario{

    public Humano(String nome) {
        super(nome);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println(this.mediator.getNome());
        System.out.println("-- " + this.getNome() + " enviou " + mensagem + " --");
        this.mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println(this.getNome() + " recebeu " + mensagem);
    }
}
