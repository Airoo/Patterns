package ru.javago.behavioral.mediator.source.realization;

import ru.javago.behavioral.mediator.source.base.Colleague;
import ru.javago.behavioral.mediator.source.base.Mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague1 gets message: " + message);
    }
}
