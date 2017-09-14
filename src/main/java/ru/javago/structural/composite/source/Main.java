package ru.javago.structural.composite.source;

import ru.javago.structural.composite.source.graphics.Ellipse;
import ru.javago.structural.composite.source.graphics.Graphic;
import ru.javago.structural.composite.source.graphics.Square;

public class Main {

    public static void main(String[] args) {
        Graphic ellipse = new Ellipse();
        Square square = new Square();

        CompositeGraphic compositeGraphic = new CompositeGraphic();

        compositeGraphic.add(ellipse);
        compositeGraphic.add(square);
        compositeGraphic.add(ellipse);

        compositeGraphic.print();
    }
}
