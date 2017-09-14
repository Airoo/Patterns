package ru.javago.structural.proxy.source;

import ru.javago.structural.proxy.source.base.Math;
import ru.javago.structural.proxy.source.proxy.MathProxy;

public class Main {

    public static void main(String[] args) {
        Math p = new MathProxy();
        System.out.println("4 + 2 = " + p.add(4, 2));
        System.out.println("4 - 2 = " + p.sub(4, 2));
        System.out.println("4 * 2 = " + p.mul(4, 2));
        System.out.println("4 / 2 = " + p.div(4, 2));
    }
}