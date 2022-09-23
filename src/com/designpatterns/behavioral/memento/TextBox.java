package com.designpatterns.behavioral.memento;

public class TextBox implements OriginadorInterface{

    private int x;
    private int y;
    private String text;
    private String fontFamily;
    private int fontSize;
    private String textAlign;
    private String fontWeight;

    public TextBox(int x, int y) {
        this.x = x;
        this.y = y;
        this.text = "";
        this.fontFamily = "Arial";
        this.fontSize = 14;
        this.textAlign = "left";
        this.fontWeight = "normal";
    }

    @Override
    public void imprimir() {
        System.out.println("TextBox{" +
                "x=" + x +
                ", y=" + y +
                ", text='" + text + '\'' +
                ", fontFamily='" + fontFamily + '\'' +
                ", fontSize=" + fontSize +
                ", textAlign='" + textAlign + '\'' +
                ", fontWeight='" + fontWeight + '\'' +
                '}');
    }

    @Override
    public MementoInterface salvar() {
        return new TextBoxMemento(
                this,
                this.x,
                this.y,
                this.text,
                this.fontFamily,
                this.fontSize,
                this.textAlign,
                this.fontWeight
        );
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }
}
