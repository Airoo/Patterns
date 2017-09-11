package ru.javago.generative.factoryMethod.source;

public class ShipLogistics extends Logistics {
    Transport createTransport() {
        return new Ship();
    }
}
