package ru.javago.generative.factoryMethod.source;

public class TruckLogistics extends Logistics {
    Transport createTransport() {
        return new Truck();
    }
}
