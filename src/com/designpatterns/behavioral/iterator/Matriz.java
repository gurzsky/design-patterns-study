package com.designpatterns.behavioral.iterator;

import java.util.ArrayList;

public class Matriz implements Agregado{

    private ArrayList<ArrayList<Integer>> matriz
            = new ArrayList<ArrayList<Integer> >();
    private int quantidadeLinhas;
    private int quantidadeColunas;
    private int linhaAtual = 0;
    private int colunaAtual = 0;

    private int inicializaLinhasMatriz = 0;

    public Matriz(int quantidadeLinhas, int quantidadeColunas) {

        this.quantidadeLinhas = quantidadeLinhas;
        this.quantidadeColunas = quantidadeColunas;

        while (inicializaLinhasMatriz < quantidadeLinhas) {
            matriz.add(new ArrayList<Integer>());
            inicializaLinhasMatriz++;
        }
    }

    public boolean addItem(Integer item) {
        if (this.linhaAtual == this.quantidadeLinhas - 1 && this.colunaAtual == this.quantidadeColunas) {
            return false;
        }

        if (this.colunaAtual == this.quantidadeColunas) {
            this.linhaAtual++;
            this.colunaAtual = 0;
        }

        this.matriz.get(linhaAtual).add(colunaAtual, item);
        this.colunaAtual++;
        return true;
    }

    public Integer getItem(int linha, int coluna) {
        return this.matriz.get(linha).get(coluna);
    }

    public int getQuantidadeLinhas() {
        return quantidadeLinhas;
    }

    public int getQuantidadeColunas() {
        return quantidadeColunas;
    }

    @Override
    public Iterator createIterator() {
        return new MatrizIterator(this);
    }
}
