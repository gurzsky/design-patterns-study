package com.designpatterns.behavioral.iterator;

public class IteratorMain {

    public static void main(String[] args) {
        Integer[] lista = {1,2,3,4,5,6,7,8,9};
        Integer[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        ListaIterator listaIterator = new ListaIterator(lista);
        MatrizIterator matrizIterator = new MatrizIterator(matriz);

        System.out.println("Lista");
        Impressora.iterar(listaIterator);
        System.out.println("Matriz");
        Impressora.iterar(matrizIterator);
    }
}
