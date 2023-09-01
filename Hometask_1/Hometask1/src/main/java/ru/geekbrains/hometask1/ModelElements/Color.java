package ru.geekbrains.hometask1.ModelElements;

public class Color {

    private int r;
    private int g;
    private int b;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getRed() {
        return this.r;
    }

    public void setRed(int r) {
        this.r = r;
    }

    public int getGreen() {
        return this.g;
    }

    public void setGreen(int g) {
        this.g = g;
    }

    public int getBlue() {
        return this.b;
    }

    public void setBlue(int b) {
        this.b = b;
    }

}
