package com.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Supermercado implements Elemento {

    private String nome;
    private List<Departamento> departamentos;

    public Supermercado(String nome) {
        this.nome = nome;
        departamentos = new ArrayList<>();
    }

    public void addDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public String getNome() {
        return nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    @Override
    public float aceitar(Visitor visitor) {
        return visitor.visitSupermercado(this);
    }
}
