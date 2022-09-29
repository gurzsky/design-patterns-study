package com.designpatterns.creational.prototype;

public class Trabalho implements Prototype{

    private String nome;
    private String autor;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Prototype clone() {
        Trabalho clone =  new Trabalho();
        clone.setNome(this.getNome());
        clone.setAutor(this.getAutor());
        clone.setTipo(this.getTipo());
        return clone;
    }

    @Override
    public String toString() {
        return "Trabalho{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
