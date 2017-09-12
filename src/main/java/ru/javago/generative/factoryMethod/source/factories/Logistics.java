package ru.javago.generative.factoryMethod.source.factories;

import ru.javago.generative.factoryMethod.source.transport.Transport;

public abstract class Logistics {
    abstract Transport createTransport();

    public void deliver(String cargo, String place) {
        Transport transport = createTransport();
        transport.deliver(cargo, place);
    }
}
