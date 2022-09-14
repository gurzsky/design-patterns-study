package com.designpatterns.structural.composite;

public class GerenciadorDeArquivos {

    private Component raiz;

    public GerenciadorDeArquivos(Component raiz) {
        this.raiz = raiz;
    }

    public void exibirTodos() {
        try {
            this.raiz.exibir();
        } catch (UnsupportedOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
