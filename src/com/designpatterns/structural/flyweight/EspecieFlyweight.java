package com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class EspecieFlyweight {

    private String nome;
    private String cor;
    private Float alturaMaxima;

    public EspecieFlyweight(String nome, String cor, Float alturaMaxima) {
        this.nome = nome;
        this.cor = cor;
        this.alturaMaxima = alturaMaxima;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Float getAlturaMaxima() {
        return alturaMaxima;
    }

    public EspecieFlyweight retornaEspecie() {
        EspecieFlyweight especie = new EspecieFlyweight(this.nome, this.cor, this.alturaMaxima);
        return especie;
    }

    @Override
    public String toString() {
        return "EspecieFlyweight{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", alturaMaxima=" + alturaMaxima +
                '}';
    }
}
