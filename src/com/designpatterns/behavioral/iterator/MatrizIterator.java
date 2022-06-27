package com.designpatterns.behavioral.iterator;

public class MatrizIterator implements Iterator{

    private Integer[][] matriz;
    private int indiceLinha = 0;
    private int indiceColuna = 0;
    private int quantidadeLinhas;
    private int quantidadeColunas;

    public MatrizIterator(Integer[][] matriz) {
        this.matriz = matriz;
        this.quantidadeLinhas = matriz.length;
        this.quantidadeColunas = matriz[0].length;
    }

    @Override
    public boolean hasNext() {
        if (this.indiceLinha >= this.quantidadeLinhas)
            return false;
        return true;
    }

    @Override
    public Integer next() {
        Integer item = this.matriz[indiceLinha][indiceColuna];
        this.incrementarIndice();
        return item;
    }

    public void incrementarIndice() {
        if (this.indiceColuna == this.quantidadeColunas - 1) {
            this.indiceLinha++;
            this.indiceColuna = 0;
        } else {
            this.indiceColuna++;
        }
    }
}
