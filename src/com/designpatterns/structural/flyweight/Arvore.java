package com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Arvore {

    private int x;
    private int y;
    private String nome;
    private String cor;
    private String alturaMaxima;

    public Arvore(int x, int y, String nome, String cor, String alturaMaxima) {
        this.x = x;
        this.y = y;
        this.nome = nome;
        this.cor = cor;
        this.alturaMaxima = alturaMaxima;
    }

    public List<Arvore> retornaArvore() {
        Arvore arvore = new Arvore(this.x, this.y, this.nome, this.cor, this.alturaMaxima);
        List<Arvore> arvores = new ArrayList<>();
        arvores.add(arvore);
        return arvores;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "x=" + x +
                ", y=" + y +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", alturaMaxima='" + alturaMaxima + '\'' +
                '}';
    }
}
