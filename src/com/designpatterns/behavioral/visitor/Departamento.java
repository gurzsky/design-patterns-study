package com.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements Elemento{

    private String nome;
    private List<Produto> produtos;

    public Departamento(String nome) {
        this.nome = nome;
        produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public float aceitar(Visitor visitor) {
        return visitor.visitDepartamento(this);
    }
}
