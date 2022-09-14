package com.designpatterns.structural.composite;

public class Main {

    public static void main(String[] args) {

        Pasta raiz = new Pasta("Raiz", "/");
        Pasta pasta1 = new Pasta("Pasta 1", "pasta1/");
        Pasta pasta2 = new Pasta("Pasta 2", "pasta2/");
        Pasta pasta2_1 = new Pasta("Pasta 2.1", "pasta2-1/");
        Pasta pasta3 = new Pasta("Pasta 3", "pasta3/");

        Arquivo arquivo1 = new Arquivo("Arquivo 1", "/arquivo1");
        Arquivo arquivo2 = new Arquivo("Arquivo 2", "/arquivo2");
        Arquivo arquivo3 = new Arquivo("Arquivo 3", "/arquivo3");
        Arquivo arquivo4 = new Arquivo("Arquivo 4", "/arquivo4");
        Arquivo arquivo5 = new Arquivo("Arquivo 5", "/arquivo5");
        Arquivo arquivo6 = new Arquivo("Arquivo 6", "/arquivo6");

        raiz.adicionar(pasta1);
        raiz.adicionar(pasta2);
        raiz.adicionar(pasta3);
        pasta2.adicionar(pasta2_1);

        pasta1.adicionar(arquivo1);
        pasta1.adicionar(arquivo2);

        pasta2.adicionar(arquivo3);
        pasta2.adicionar(arquivo4);

        pasta2_1.adicionar(arquivo5);

        pasta3.adicionar(arquivo6);

        GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos(raiz);
        gerenciador.exibirTodos();
    }
}
