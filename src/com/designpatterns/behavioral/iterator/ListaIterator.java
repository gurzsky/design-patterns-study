package com.designpatterns.behavioral.iterator;

public class ListaIterator implements Iterator{

    private Lista lista;
    private int indice = 0;
    private int tamanho;

    public ListaIterator(Lista lista) {
        this.lista = lista;
        this.tamanho = lista.getTamanho();
    }

    @Override
    public boolean hasNext() {
        if (this.indice >= this.tamanho)
            return false;
        return true;
    }

    @Override
    public Integer next() {
        Integer item = this.lista.getItem(this.indice);
        this.indice++;
        return item;
    }
}
