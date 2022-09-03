package com.designpatterns.structural.proxy;

public class PessoaFisicaReceitaFederal {

    private String nome;
    private String cpf;
    private int idade;
    private boolean cpfAtivo;
    public PessoaFisicaReceitaFederal(String cpf) {
        this.cpf = cpf;
        this.nome = "Joao";
        this.idade = 25;
        this.cpfAtivo = true;
        Thread. sleep(5);
        System.out.println("Pessoa fisica criada com sucesso!");
    }
}
