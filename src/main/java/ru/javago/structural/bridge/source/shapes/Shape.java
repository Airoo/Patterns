package ru.javago.structural.bridge.source.shapes;

import ru.javago.structural.bridge.source.drawers.Drawer;

public abstract class Shape {
    protected Drawer drawer;

    public Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    public abstract void draw();

    public abstract void enlargeRadius(int multiplier);
}
