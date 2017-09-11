package ru.javago.generative.factoryMethod.source;

public abstract class Logistics {
    abstract Transport createTransport();

    public void deliver(String cargo, String place) {
        Transport transport = createTransport();
        transport.deliver(cargo, place);
    }
}
