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
        return this.pessoaFisica.isCpfAtivo();
    }

    public boolean verificaMaioridade() {
        return this.idade >= 18 && this.idade == this.pessoaFisica.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
}
