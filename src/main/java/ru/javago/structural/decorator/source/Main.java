package ru.javago.structural.decorator.source;

import ru.javago.structural.decorator.source.base.Decorator;
import ru.javago.structural.decorator.source.realization.DecoratorComma;
import ru.javago.structural.decorator.source.realization.DecoratorHello;
import ru.javago.structural.decorator.source.realization.DecoratorSpace;
import ru.javago.structural.decorator.source.realization.MainComponent;

public class Main {

    public static void main(String[] args) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation();
        c.newOperation();
    }
}
