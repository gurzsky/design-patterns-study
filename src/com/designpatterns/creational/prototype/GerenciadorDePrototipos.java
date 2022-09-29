package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDePrototipos {

    private Map<String, Prototype> prototipos = new HashMap();

    public GerenciadorDePrototipos() {
        Livro livro = new Livro();
        livro.setNome("Desconhecido");
        livro.setAutor("Desconhecido");
        livro.setNumeroPaginas(0);
        this.prototipos.put("livro", livro);

        Revista revista = new Revista();
        revista.setNome("Desconhecido");
        revista.setEdicao(0);
        this.prototipos.put("revista", revista);

        Trabalho trabalho = new Trabalho();
        trabalho.setNome("Desconhecido");
        trabalho.setAutor("Desconhecido");
        trabalho.setTipo("Desconhecido");
        this.prototipos.put("trabalho", trabalho);
    }

    public Prototype getInstance(String identificador) {
        return this.prototipos.get(identificador);
    }
}
