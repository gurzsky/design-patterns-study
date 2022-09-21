package com.designpatterns.behavioral.visitor;

public class Client {
    public static void main(String[] args) {

        Supermercado supermercado = new Supermercado("Supermercado Esquina");

        Departamento departamento1 = new Departamento("Alimentaçao Básica");
        Produto arroz = new Produto("Arroz 5Kg", 18, 30);
        Produto macarrao = new Produto("Macarrao", 3.20f, 15);

        departamento1.addProduto(arroz);
        departamento1.addProduto(macarrao);

        Departamento departamento2 = new Departamento("Higiene");
        Produto papelHigienico = new Produto("Papel Higienico", 11, 35);
        Produto sabonete = new Produto("Sabonete", 1.20f, 10);

        departamento2.addProduto(papelHigienico);
        departamento2.addProduto(sabonete);

        supermercado.addDepartamento(departamento1);
        supermercado.addDepartamento(departamento2);

        Visitor lucratividade = new Lucratividade();

        float lucratividadeSupermercado = supermercado.aceitar(lucratividade);
        System.out.println("Lucratividade Supermercado: R$ " + lucratividadeSupermercado);

        float lucratividadeDepartamento1 = departamento1.aceitar(lucratividade);
        System.out.println("Lucratividade Departamento1: R$ " + lucratividadeDepartamento1);

        float lucratividadeArroz = arroz.aceitar(lucratividade);
        System.out.println("Lucratividade Arroz: R$ " + lucratividadeArroz);

        float lucratividadeMacarrao = macarrao.aceitar(lucratividade);
        System.out.println("Lucratividade Macarrao: R$ " + lucratividadeMacarrao);

        float lucratividadeDepartamento2 = departamento2.aceitar(lucratividade);
        System.out.println("Lucratividade Departamento2: R$ " + lucratividadeDepartamento2);

        float lucratividadePapelHigienico = papelHigienico.aceitar(lucratividade);
        System.out.println("Lucratividade Papel Higienico: R$ " + lucratividadePapelHigienico);

        float lucratividadeSabonete = sabonete.aceitar(lucratividade);
        System.out.println("Lucratividade Sabonete: R$ " + lucratividadeSabonete);
    }
}
