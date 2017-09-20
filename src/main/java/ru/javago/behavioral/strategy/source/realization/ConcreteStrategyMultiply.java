package ru.javago.behavioral.strategy.source.realization;

import ru.javago.behavioral.strategy.source.base.Strategy;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyMultiply's execute()");
        return a * b;
    }
}
