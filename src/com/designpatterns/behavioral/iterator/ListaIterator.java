package com.designpatterns.behavioral.iterator;

public class ListaIterator implements Iterator{

    private Integer[] lista;
    private int indice = 0;
    private int tamanho;

    public ListaIterator(Integer[] lista) {
        this.lista = lista;
        this.tamanho = lista.length;
    }

    @Override
    public boolean hasNext() {
        if (this.indice >= this.tamanho)
            return false;
        return true;
    }

    @Override
    public Integer next() {
        Integer item = this.lista[this.indice];
        this.indice++;
        return item;
    }
}
