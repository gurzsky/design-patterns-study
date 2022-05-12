package com.designpatterns.creational.builder;

public interface BuilderInterfaceGeradorPDF {

    public GeradorPDF getGeradorPDF();
    public void setPageConfiguration();
    public void setMargin();
    public void setHeader();
    public void setFooter();
}
