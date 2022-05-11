package com.designpatterns.creational.builder;

public class GeradorPDFMain {

    public static void main(String[] args) {
        GeradorPDF pdf = new GeradorPDF(
        "portrait",
        "mm",
        210,
        297,
        30,
        20,
        30,
        20,
        true,
        15,
        true,
        15,
        "ffffff",
        "UTF-8"
        );
        System.out.println("A3 " + pdf);

        pdf = new GeradorPDF(
                "portrait",
                "mm",
                297,
                420,
                60,
                40,
                60,
                40,
                false,
                0,
                false,
                0,
                "ffffff",
                "UTF-8"
        );
        System.out.println("A4 " + pdf);
    }
}
