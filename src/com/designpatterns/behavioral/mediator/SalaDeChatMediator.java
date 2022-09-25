package com.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SalaDeChatMediator implements SalaDeChatMediatorInterface {

    private List<Usuario> usuarios;
    private ChatBot chatBot;
    private String nome;

    public SalaDeChatMediator(ChatBot chatBot, String nome) {
        usuarios = new ArrayList<>();
        this.chatBot = chatBot;
        this.chatBot.setMediator(this);
        this.nome = nome;
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario usuario) {
        if (this.chatBot.validarMensagem(usuario)) {
            for (Usuario user: usuarios) {
                if (user != usuario) {
                    user.receber(mensagem);
                }
            }
        }
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) {
        for (Usuario user: this.usuarios) {
            if (user == usuario) {
                this.usuarios.remove(usuario);
            }
        }

    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
