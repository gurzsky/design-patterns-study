package com.designpatterns.creational.builder;

public class GeradorPDFMain {

    public static void main(String[] args) {
        BuilderA4 builderA4 = new BuilderA4();
        builderA4.setPageConfiguration();
        builderA4.setMargin();
        builderA4.setHeader();
        builderA4.setFooter();
        GeradorPDF pdf = builderA4.getGeradorPDF();
        System.out.println("A4 " + pdf);

        BuilderA3 builderA3 = new BuilderA3();
        pdf = builderA3.getGeradorPDF();
        builderA3.setPageConfiguration();
        builderA3.setMargin();
        builderA3.setHeader();
        builderA3.setFooter();
        System.out.println("A3 " + pdf);
    }
}
