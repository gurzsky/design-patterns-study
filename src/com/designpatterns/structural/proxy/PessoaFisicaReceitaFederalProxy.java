package com.designpatterns.structural.proxy;

public class PessoaFisicaReceitaFederalProxy implements ReceitaFederalInterface {

    private String cpf;
    private ReceitaFederalInterface pessoaFisicaRF = null;

    public PessoaFisicaReceitaFederalProxy(String cpf) {
        this.cpf = cpf;
    }

    private void criarPessoaFisicaReceitaFederal() {
        if (pessoaFisicaRF == null) {
            this.pessoaFisicaRF = new PessoaFisicaReceitaFederal(this.cpf);
        }
    }

    @Override
    public boolean isCpfAtivo() {
        this.criarPessoaFisicaReceitaFederal();
        return this.pessoaFisicaRF.isCpfAtivo();
    }

    @Override
    public String getNome() {
        this.criarPessoaFisicaReceitaFederal();
        return this.pessoaFisicaRF.getNome();
    }

    @Override
    public int getIdade() {
        this.criarPessoaFisicaReceitaFederal();
        return this.getIdade();
    }
}
