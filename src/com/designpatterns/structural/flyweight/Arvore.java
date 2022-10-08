package com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Arvore {

    private int x;
    private int y;

    private EspecieFlyweight flyweight;


    public Arvore(int x, int y, EspecieFlyweight flyweight) {
        this.x = x;
        this.y = y;
        this.flyweight = flyweight;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "x=" + x +
                ", y=" + y +
                ", especie=" + this.flyweight.retornaEspecie() +
                '}';
    }

    public Arvore retornaArvore() {
        return new Arvore(this.x, this.y, this.flyweight.retornaEspecie());
    }
}
