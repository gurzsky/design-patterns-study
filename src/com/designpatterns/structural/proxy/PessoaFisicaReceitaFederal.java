package com.designpatterns.structural.proxy;

public class PessoaFisicaReceitaFederal implements ReceitaFederalInterface{

    private String nome;
    private String cpf;
    private int idade;
    private boolean cpfAtivo;
    public PessoaFisicaReceitaFederal(String cpf) {
        this.cpf = cpf;
        this.nome = "Joao";
        this.idade = 25;
        this.cpfAtivo = true;
        try {
            Thread. sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Pessoa fisica criada com sucesso!");
    }

    public boolean isCpfAtivo() {
        return cpfAtivo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
