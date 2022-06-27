package com.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Lista implements Agregado{

    private int tamanho;
    private List<Integer> lista = new ArrayList<>();

    public Lista(int tamanhoMaximo) {
        this.tamanho = tamanhoMaximo;
    }

    public boolean addItem(Integer item) {
        if (lista.size() < this.tamanho) {
            this.lista.add(item);
            return true;
        }
        return false;
    }

    public Integer getItem(int indice) {
        return this.lista.get(indice);
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public Iterator createIterator() {
        return new ListaIterator(this);
    }
}
