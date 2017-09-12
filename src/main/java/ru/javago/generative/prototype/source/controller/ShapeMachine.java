package ru.javago.generative.prototype.source.controller;

import ru.javago.generative.prototype.source.shapes.Shape;

public class ShapeMachine {
    private Shape shape;

    public ShapeMachine(Shape shape) {
        this.shape = shape;
    }

    public Shape createShape() throws CloneNotSupportedException {
        return this.shape.clone();
    }
}
