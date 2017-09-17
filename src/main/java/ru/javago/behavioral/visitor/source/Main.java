package ru.javago.behavioral.visitor.source;

import ru.javago.behavioral.visitor.source.points.Point;
import ru.javago.behavioral.visitor.source.points.Point2d;
import ru.javago.behavioral.visitor.source.visitors.Chebyshev;
import ru.javago.behavioral.visitor.source.visitors.Visitor;

public class Main {

    public static void main(String[] args) {
        Point p = new Point2d(1, 2);
        Visitor v = new Chebyshev();
        p.accept(v);
        System.out.println(p.getMetric());
    }
}
