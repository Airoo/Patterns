package ru.javago.behavioral.visitor.source.visitors;

import ru.javago.behavioral.visitor.source.points.Point2d;
import ru.javago.behavioral.visitor.source.points.Point3d;

public interface Visitor {
    public void visit(Point2d p);

    public void visit(Point3d p);
}
