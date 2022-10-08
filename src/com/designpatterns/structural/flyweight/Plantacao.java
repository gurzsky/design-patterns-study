package com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Plantacao {

    private List<Arvore> arvores = new ArrayList<>();
    private EspecieFabrica especieFabrica = new EspecieFabrica();

    public void addArvore(int x, int y, String nome, String cor, Float alturaMaxima) {
        EspecieFlyweight especie = this.especieFabrica.getEspecie(nome, cor, alturaMaxima);
        Arvore arvore = new Arvore(x, y, especie);
        this.arvores.add(arvore);
    }

    public List<EspecieFlyweight> retornaEspecies() {
        List<EspecieFlyweight> especies = this.especieFabrica.retornaTodasEspecies();
        List<EspecieFlyweight> especiesList = new ArrayList<>();
        for (EspecieFlyweight especie: especies) {
            especiesList.add(especie.retornaEspecie());
        }
        return especiesList;
    }

    public List<Arvore> retornaArvores() {
        List<Arvore> listaArvore = new ArrayList<>();
        for (Arvore arvore: this.arvores) {
            listaArvore.add(arvore.retornaArvore());
        }
        return listaArvore;
    }


}
