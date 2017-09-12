package ru.javago.generative.factoryMethod.source;

import ru.javago.generative.factoryMethod.source.factories.Logistics;
import ru.javago.generative.factoryMethod.source.factories.ShipLogistics;
import ru.javago.generative.factoryMethod.source.factories.TruckLogistics;

public class Main {
    private static Logistics logistic;

    public static void main(String[] args) {
        logistic = new ShipLogistics();
        logistic.deliver("something", "somewhere");
        logistic = new TruckLogistics();
        logistic.deliver("something", "somewhere");
    }
}
