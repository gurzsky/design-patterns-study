package com.designpatterns.creational.prototype;

public class Livro implements Prototype{

    private String nome;
    private String autor;
    private int numeroPaginas;

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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public Prototype clone() {
        Livro clone =  new Livro();
        clone.setNome(this.getNome());
        clone.setAutor(this.getAutor());
        clone.setNumeroPaginas(this.getNumeroPaginas());
        return clone;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
