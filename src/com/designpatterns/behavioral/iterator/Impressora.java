package com.designpatterns.behavioral.iterator;

public class Impressora {

    public static void iterar(Iterator iterator) {

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
