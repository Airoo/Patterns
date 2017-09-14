package ru.javago.structural.proxy.source.proxy;

import ru.javago.structural.proxy.source.base.Math;
import ru.javago.structural.proxy.source.base.MathImpl;

public class MathProxy implements Math {
    private Math math;

    public double add(double x, double y) {
        if(math == null) {
            math = new MathImpl();
        }
        return math.add(x, y);
    }

    public double sub(double x, double y) {
        if(math == null) {
            math = new MathImpl();
        }
        return math.sub(x, y);
    }

    public double mul(double x, double y) {
        if(math == null) {
            math = new MathImpl();
        }
        return math.mul(x, y);
    }

    public double div(double x, double y) {
        if(math == null) {
            math = new MathImpl();
        }
        return math.div(x, y);
    }
}
