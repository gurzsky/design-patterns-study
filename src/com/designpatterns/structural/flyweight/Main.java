package com.designpatterns.structural.flyweight;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int iteracoes = 10;
        Random random = new Random();
        Plantacao plantacao = new Plantacao();
        for (int i = 0; i < iteracoes; i++) {
            plantacao.addArvore(random.nextInt(500), random.nextInt(500), "Ipe", "Amarelo", 10f);
            plantacao.addArvore(random.nextInt(500), random.nextInt(500), "Palmeira", "Verde", 7f);
            plantacao.addArvore(random.nextInt(500), random.nextInt(500), "Jabuticabeira", "Roxa", 5f);
        }

        System.out.println("Arvores");
        System.out.println(plantacao.retornaArvores());
    }
}
