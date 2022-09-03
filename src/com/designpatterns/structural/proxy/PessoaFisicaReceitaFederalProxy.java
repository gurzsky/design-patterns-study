package com.designpatterns.structural.proxy;

public class PessoaFisicaReceitaFederalProxy implements ReceitaFederalInterface {

    private String cpf;
    private ReceitaFederalInterface pessoaFisicaRF = null;

    public PessoaFisicaReceitaFederalProxy(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean isCpfAtivo() {
        return false;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public int getIdade() {
        return 0;
    }
}
