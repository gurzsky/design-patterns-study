package com.designpatterns.creational.prototype;

public class Revista implements Prototype {

    private String nome;
    private int edicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public Prototype clone() {
        Revista clone =  new Revista();
        clone.setNome(this.getNome());
        clone.setEdicao(this.getEdicao());
        return clone;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nome='" + nome + '\'' +
                ", edicao='" + edicao + '\'' +
                '}';
    }
}
