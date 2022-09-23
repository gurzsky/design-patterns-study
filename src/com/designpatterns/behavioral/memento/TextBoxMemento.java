package com.designpatterns.behavioral.memento;

public class TextBoxMemento implements MementoInterface {

    private TextBox textBox;
    private int x;
    private int y;
    private String text;
    private String fontFamily;
    private int fontSize;
    private String textAlign;
    private String fontWeight;

    public TextBoxMemento(TextBox textBox, int x, int y, String text, String fontFamily, int fontSize, String textAlign, String fontWeight) {
        this.textBox = textBox;
        this.x = x;
        this.y = y;
        this.text = text;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.textAlign = textAlign;
        this.fontWeight = fontWeight;
    }

    @Override
    public void restaurar() {
        this.textBox.setPosition(this.x, this.y);
        this.textBox.setText(this.text);
        this.textBox.setFontFamily(this.fontFamily);
        this.textBox.setFontSize(this.fontSize);
        this.textBox.setTextAlign(this.textAlign);
        this.textBox.setFontWeight(this.fontWeight);

    }
}
