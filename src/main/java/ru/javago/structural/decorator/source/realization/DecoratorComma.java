package ru.javago.structural.decorator.source.realization;

import ru.javago.structural.decorator.source.base.Decorator;
import ru.javago.structural.decorator.source.base.InterfaceComponent;

public class DecoratorComma extends Decorator {
    public DecoratorComma(InterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New comma operation");
    }
}
