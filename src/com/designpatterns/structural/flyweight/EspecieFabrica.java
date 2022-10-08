package com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class EspecieFabrica {

    private List<EspecieFlyweight> especies = new ArrayList<>();

    public EspecieFlyweight getEspecie(String nome, String cor, Float alturaMaxima) {
        for (EspecieFlyweight especie: this.especies) {
            if (especie.getNome() == nome &&
                especie.getCor() == cor &&
                especie.getAlturaMaxima() == alturaMaxima) {
                    return especie;
            }
        }

        EspecieFlyweight novaEspecie = new EspecieFlyweight(nome, cor, alturaMaxima);
        this.especies.add(novaEspecie);
        return novaEspecie;
    }

    public List<EspecieFlyweight> retornaTodasEspecies() {
        return this.especies;
    }
}
