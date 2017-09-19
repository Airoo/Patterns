package ru.javago.behavioral.observer.source.base;

public interface Observer {
    void update(float temperature, float humidity, int pressure);
}
