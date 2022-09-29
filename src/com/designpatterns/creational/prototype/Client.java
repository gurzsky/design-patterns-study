package com.designpatterns.creational.prototype;

public class Client {

    public static void main(String[] args) {

        GerenciadorDePrototipos gerenciador = new GerenciadorDePrototipos();
        Prototype livroProtipo = gerenciador.getInstance("livro");

        Livro livro1 = (Livro) livroProtipo.clone();

        System.out.println("Livro 1 com valores padrao");
        System.out.println(livro1);

        livro1.setNome("Livro 1");
        livro1.setAutor("Manuel");
        livro1.setNumeroPaginas(300);

        System.out.println("Livro 1 com valores editados");
        System.out.println(livro1);

        Livro livro2 = (Livro) livroProtipo.clone();

        System.out.println("Livro 2 com valores padrao");
        System.out.println(livro2);

        livro2.setNome("Livro 2");
        livro2.setAutor("Maria");
        livro2.setNumeroPaginas(200);

        System.out.println("=== Livro 1 e 2 com valores editados ===");
        System.out.println(livro1);
        System.out.println(livro2);

    }
}
