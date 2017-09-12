package ru.javago.generative.factoryMethod.source.factories;

import ru.javago.generative.factoryMethod.source.transport.Ship;
import ru.javago.generative.factoryMethod.source.transport.Transport;

public class ShipLogistics extends Logistics {
    Transport createTransport() {
        return new Ship();
    }
}
