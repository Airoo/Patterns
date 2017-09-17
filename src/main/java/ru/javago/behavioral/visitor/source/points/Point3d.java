package ru.javago.behavioral.visitor.source.points;

import ru.javago.behavioral.visitor.source.visitors.Visitor;

public class Point3d extends Point {
    private double y;
    private double x;
    private double z;

    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }
}
