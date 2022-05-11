package com.designpatterns.creational.builder;

public class BuilderA4 {

    private GeradorPDF geradorPDF;

    public BuilderA4() {
        this.geradorPDF = new GeradorPDF();
        this.geradorPDF.setPageOrientation("portrait");
        this.geradorPDF.setUnit("mm");
        this.geradorPDF.setPageSizeX(210);
        this.geradorPDF.setPageSizeY(297);
        this.geradorPDF.setMarginTop(30);
        this.geradorPDF.setMarginRight(20);
        this.geradorPDF.setMarginBottom(30);
        this.geradorPDF.setMarginLeft(20);
        this.geradorPDF.setHasHeader(true);
        this.geradorPDF.setHeaderHeight(15);
        this.geradorPDF.setHasFooter(true);
        this.geradorPDF.setFooterHeight(15);
        this.geradorPDF.setPageColor("ffffff");
        this.geradorPDF.setEncode("UTF-8");
    }

    public GeradorPDF getGeradorPDF() {
        return this.geradorPDF;
    }
}
