package ru.javago.generative.prototype.source.shapes;

public class Shape implements Cloneable {
    private int width;
    private int height;

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
