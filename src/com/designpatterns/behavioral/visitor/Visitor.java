package com.designpatterns.behavioral.visitor;

public interface Visitor {

    public float visitSupermercado(Supermercado supermercado);

    public float visitDepartamento(Departamento departamento);

    public float visitProduto(Produto produto);
}
