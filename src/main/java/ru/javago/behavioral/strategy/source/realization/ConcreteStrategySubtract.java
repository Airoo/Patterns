package ru.javago.behavioral.strategy.source.realization;

import ru.javago.behavioral.strategy.source.base.Strategy;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategySubtract's execute()");
        return a - b;
    }
}
