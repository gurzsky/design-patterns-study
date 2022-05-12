package com.designpatterns.creational.builder;

public class GeradorPDFMain {

    public static void main(String[] args) {

        BuilderA4 builderA4 = new BuilderA4();
        GeradorPDFDirector director = new GeradorPDFDirector(builderA4);
        director.criarGeradorPDF();
        GeradorPDF pdf = builderA4.getGeradorPDF();
        System.out.println("A4 " + pdf);

        BuilderA3 builderA3 = new BuilderA3();
        director = new GeradorPDFDirector(builderA3);
        director.criarGeradorPDFNoHeaderNoFooter();
        pdf = builderA3.getGeradorPDF();
        System.out.println("A3 " + pdf);
    }
}
