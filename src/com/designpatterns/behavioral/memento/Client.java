package com.designpatterns.behavioral.memento;

public class Client {
    public static void main(String[] args) {
        TextBox textBox = new TextBox(20, 100);

        Historico historico = new Historico();

        textBox.setText("Teste de caixa de texto");
        textBox.setFontWeight("bold");
        textBox.setFontFamily("Cursive");
        textBox.setFontSize(25);

        historico.criarCheckPoint(textBox);

        textBox.setText("Teste de caixa de texto editado");
        textBox.setFontWeight("normal");
        textBox.setFontFamily("monospace");
        textBox.setFontSize(15);
        textBox.setPosition(40, 110);

        historico.criarCheckPoint(textBox);

        textBox.setText("Teste de caixa de texto editado");
        textBox.setFontWeight("normal");
        textBox.setFontFamily("fantasy");
        textBox.setFontSize(12);
        textBox.setPosition(60, 120);

        textBox.imprimir();

        historico.desfazer();

        textBox.imprimir();

        historico.desfazer();

        textBox.imprimir();
    }
}
