package ru.javago.structural.bridge.source.shapes;

import ru.javago.structural.bridge.source.drawers.Drawer;

public class Circle extends Shape {
    private int x;

    private int y;

    private int radius;

    public Circle(Drawer drawer, int x, int y, int radius) {
        super(drawer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawer.drawCircle(x, y, radius);
    }

    @Override
    public void enlargeRadius(int multiplier) {
        radius *= multiplier;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
