package ru.javago.generative.prototype.source;

import ru.javago.generative.prototype.source.controller.ShapeMachine;
import ru.javago.generative.prototype.source.shapes.Shape;
import ru.javago.generative.prototype.source.shapes.Triangle;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape temporal = null;
        Shape prototype = new Triangle();
        ShapeMachine shapeMachine = new ShapeMachine(prototype);
        for (int i = 0; i < 100; i++) {
            temporal = shapeMachine.createShape();
        }
    }
}
