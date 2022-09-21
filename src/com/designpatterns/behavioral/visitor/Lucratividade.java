package com.designpatterns.behavioral.visitor;

import java.util.List;

public class Lucratividade implements Visitor {
    @Override
    public float visitSupermercado(Supermercado supermercado) {
        float lucratividade = 0;
        List<Departamento> departamentos = supermercado.getDepartamentos();
        for (Departamento departamento : departamentos) {
            List<Produto> produtos = departamento.getProdutos();
            for (Produto produto: produtos) {
                lucratividade += this.calculaLucratividadeProduto(produto);
            }
        }
        return lucratividade;
    }

    @Override
    public float visitDepartamento(Departamento departamento) {
        float lucratividade = 0;
        List<Produto> produtos = departamento.getProdutos();
        for (Produto produto: produtos) {
            lucratividade += this.calculaLucratividadeProduto(produto);
        }
        return lucratividade;
    }

    @Override
    public float visitProduto(Produto produto) {
        return this.calculaLucratividadeProduto(produto);
    }

    private float calculaLucratividadeProduto(Produto produto) {
        return (produto.getPreco() * produto.getMargemLucro()) / 100;
    }
}
