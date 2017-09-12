package ru.javago.generative.factoryMethod.source.factories;

import ru.javago.generative.factoryMethod.source.transport.Transport;
import ru.javago.generative.factoryMethod.source.transport.Truck;

public class TruckLogistics extends Logistics {
    Transport createTransport() {
        return new Truck();
    }
}
