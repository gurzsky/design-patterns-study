package com.designpatterns.structural.proxy;

public class Usuario {

    private String nome;
    private String cpf;
    private int idade;
    private PessoaFisicaReceitaFederal pessoaFisica;

    public Usuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.pessoaFisica = new PessoaFisicaReceitaFederal(cpf);
    }

    public boolean validaNome() {
        return this.nome == this.pessoaFisica.getNome();
    }

    public boolean verificaCPFAtivo() {
        return this.pessoaFisica.CPFAtivo();
    }

    public boolean verificaMaioridade() {
        return this.idade >= 18 && this.idade == this.pessoaFisica.getIdade();
    }
}
