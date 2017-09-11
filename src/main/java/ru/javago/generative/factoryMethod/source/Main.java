package ru.javago.generative.factoryMethod.source;

public class Main {
    private static Logistics logistic;

    public static void main(String[] args) {
        logistic = new ShipLogistics();
        logistic.deliver("something", "somewhere");
        logistic = new TruckLogistics();
        logistic.deliver("something", "somewhere");
    }
}
