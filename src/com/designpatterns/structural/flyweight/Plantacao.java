package com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Plantacao {

    private List<Arvore> arvores = new ArrayList<>();

    public void addArvore(int x, int y, String nome, String cor, String alturaMaxima) {
        Arvore arvore = new Arvore(x, y, nome, cor, alturaMaxima);
        this.arvores.add(arvore);
    }

    public List<List<Arvore>> retornaArvores() {
        List<List<Arvore>> listaArvore = new ArrayList<>();
        for (Arvore arvore: this.arvores) {
            listaArvore.add(arvore.retornaArvore());
        }
        return listaArvore;
    }


}
