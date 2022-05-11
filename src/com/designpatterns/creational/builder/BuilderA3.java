package com.designpatterns.creational.builder;

public class BuilderA3 {

    private GeradorPDF geradorPDF;

    public BuilderA3() {
        this.geradorPDF = new GeradorPDF();
        this.geradorPDF.setPageOrientation("portrait");
        this.geradorPDF.setUnit("mm");
        this.geradorPDF.setPageSizeX(297);
        this.geradorPDF.setPageSizeY(420);
        this.geradorPDF.setMarginTop(60);
        this.geradorPDF.setMarginRight(40);
        this.geradorPDF.setMarginBottom(60);
        this.geradorPDF.setMarginLeft(40);
        this.geradorPDF.setHasHeader(false);
        this.geradorPDF.setHeaderHeight(0);
        this.geradorPDF.setHasFooter(false);
        this.geradorPDF.setFooterHeight(0);
        this.geradorPDF.setPageColor("ffffff");
        this.geradorPDF.setEncode("UTF-8");
    }

    public GeradorPDF getGeradorPDF() {
        return this.geradorPDF;
    }
}
