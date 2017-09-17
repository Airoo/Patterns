package ru.javago.behavioral.visitor.source.points;

import ru.javago.behavioral.visitor.source.visitors.Visitor;

public class Point2d extends Point {
    private double x;
    private double y;

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
