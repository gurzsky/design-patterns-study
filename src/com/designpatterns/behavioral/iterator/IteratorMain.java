package com.designpatterns.behavioral.iterator;

public class IteratorMain {

    public static void main(String[] args) {

        Lista lista = new Lista(9);
        lista.addItem(1);
        lista.addItem(2);
        lista.addItem(3);
        lista.addItem(4);
        lista.addItem(5);
        lista.addItem(6);
        lista.addItem(7);
        lista.addItem(8);
        lista.addItem(9);
        lista.addItem(10);

        Matriz matriz = new Matriz(3, 3);
        matriz.addItem(1);
        matriz.addItem(2);
        matriz.addItem(3);
        matriz.addItem(4);
        matriz.addItem(5);
        matriz.addItem(6);
        matriz.addItem(7);
        matriz.addItem(8);
        matriz.addItem(9);
        matriz.addItem(10);

        System.out.println("Lista");
        Impressora.iterar(lista);
        System.out.println("Matriz");
        Impressora.iterar(matriz);
    }
}
