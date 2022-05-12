package com.designpatterns.creational.builder;

public class GeradorPDFDirector {

    private BuilderInterfaceGeradorPDF builderInterfaceGeradorPDF;

    public GeradorPDFDirector(BuilderInterfaceGeradorPDF builderInterfaceGeradorPDF) {
        this.builderInterfaceGeradorPDF = builderInterfaceGeradorPDF;
    }

    public void setBuilderGeradorPDF(BuilderInterfaceGeradorPDF builderInterfaceGeradorPDF) {
        this.builderInterfaceGeradorPDF = builderInterfaceGeradorPDF;
    }

    public void criarGeradorPDF() {
        this.builderInterfaceGeradorPDF.setPageConfiguration();
        this.builderInterfaceGeradorPDF.setMargin();
        this.builderInterfaceGeradorPDF.setHeader();
        this.builderInterfaceGeradorPDF.setFooter();
    }

    public void criarGeradorPDFNoHeader() {
        this.builderInterfaceGeradorPDF.setPageConfiguration();
        this.builderInterfaceGeradorPDF.setMargin();
        this.builderInterfaceGeradorPDF.setFooter();
    }

    public void criarGeradorPDFNoHeaderNoFooter() {
        this.builderInterfaceGeradorPDF.setPageConfiguration();
        this.builderInterfaceGeradorPDF.setMargin();
    }
}
