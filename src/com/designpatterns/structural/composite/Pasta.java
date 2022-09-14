package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Component{

    private String nome;
    private String caminho;
    private List<Component> componentes;

    public Pasta(String nome, String caminho) {
        this.nome = nome;
        this.caminho = caminho;
        this.componentes = new ArrayList<>();
    }

    public void adicionar(Component componente) {
        this.componentes.add(componente);
    }

    public void remover(Component componente) {
        this.componentes.remove(componente);
    }

    public Component recuperarFilho(int indice) {
        return this.componentes.get(indice);
    }

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void exibir() {
        System.out.println(" ## " + this.getNome() + " - [" + this.getCaminho() + "] ##");
        this.componentes.forEach(componente -> {
            try {
                componente.exibir();
            } catch (UnsupportedOperationException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
