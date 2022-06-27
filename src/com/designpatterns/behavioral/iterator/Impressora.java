package com.designpatterns.behavioral.iterator;

public class Impressora {

    public static void iterar(Agregado agregado) {

        Iterator iterator = agregado.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
