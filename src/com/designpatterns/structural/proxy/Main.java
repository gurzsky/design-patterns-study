package com.designpatterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Usuario pessoaFisica = new Usuario("Joao", "123456789", 25);
        System.out.println(pessoaFisica.getNome());
    }
}
