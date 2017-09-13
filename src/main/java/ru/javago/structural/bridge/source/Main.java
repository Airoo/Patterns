package ru.javago.structural.bridge.source;

import ru.javago.structural.bridge.source.drawers.LargeCircleDrawer;
import ru.javago.structural.bridge.source.drawers.SmallCircleDrawer;
import ru.javago.structural.bridge.source.shapes.Circle;
import ru.javago.structural.bridge.source.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(new LargeCircleDrawer(), 5, 10, 10),
                new Circle(new SmallCircleDrawer(), 20, 30, 100)};

        for (Shape next : shapes) {
            next.draw();
        }
    }
}
