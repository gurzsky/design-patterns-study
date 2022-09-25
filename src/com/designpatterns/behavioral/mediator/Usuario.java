package com.designpatterns.behavioral.mediator;

public abstract class Usuario {

    protected SalaDeChatMediatorInterface mediator;
    protected String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void setMediator(SalaDeChatMediatorInterface mediator) {

        if (mediator != null)
            this.mediator.removerUsuario(this);

        this.mediator = mediator;
        mediator.adicionarUsuario(this);
    }

    public String getNome() {
        return this.nome;
    }

    public abstract void enviar(String mensagem);

    public abstract void receber(String mensagem);
}
