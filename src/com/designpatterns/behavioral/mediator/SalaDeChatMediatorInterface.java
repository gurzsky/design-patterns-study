package com.designpatterns.behavioral.mediator;

public interface SalaDeChatMediatorInterface {

    public void enviarMensagem(String mensagem, Usuario usuario);
    public void adicionarUsuario(Usuario usuario);
    public void removerUsuario(Usuario usuario);
    public String getNome();
}
