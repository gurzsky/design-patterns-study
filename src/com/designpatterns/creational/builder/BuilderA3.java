package com.designpatterns.creational.builder;

public class BuilderA3 implements BuilderInterfaceGeradorPDF {

    private GeradorPDF geradorPDF;

    public BuilderA3() {
        this.geradorPDF = new GeradorPDF();
    }

    public GeradorPDF getGeradorPDF() {
        return this.geradorPDF;
    }

    @Override
    public void setPageConfiguration() {
        this.geradorPDF.setPageOrientation("portrait");
        this.geradorPDF.setUnit("mm");
        this.geradorPDF.setPageSizeX(297);
        this.geradorPDF.setPageSizeY(420);
        this.geradorPDF.setPageColor("ffffff");
        this.geradorPDF.setEncode("UTF-8");
    }

    @Override
    public void setMargin() {
        this.geradorPDF.setMarginTop(60);
        this.geradorPDF.setMarginRight(40);
        this.geradorPDF.setMarginBottom(60);
        this.geradorPDF.setMarginLeft(40);
    }

    @Override
    public void setHeader() {
        this.geradorPDF.setHasHeader(false);
        this.geradorPDF.setHeaderHeight(0);
    }

    @Override
    public void setFooter() {
        this.geradorPDF.setHasFooter(false);
        this.geradorPDF.setFooterHeight(0);
    }
}
