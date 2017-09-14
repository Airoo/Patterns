package ru.javago.structural.decorator.source.realization;

import ru.javago.structural.decorator.source.base.InterfaceComponent;

public class MainComponent implements InterfaceComponent {
    @Override
    public void doOperation() {
        System.out.println("World!");
    }
}
