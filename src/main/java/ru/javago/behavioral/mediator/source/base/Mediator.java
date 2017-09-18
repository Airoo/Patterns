package ru.javago.behavioral.mediator.source.base;

public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
