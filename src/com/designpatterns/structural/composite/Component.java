package com.designpatterns.structural.composite;

public abstract class Component {

    public void adicionar(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public void remover(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public Component recuperarFilho(int indice) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public String getNome() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public String getCaminho() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public void exibir() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
