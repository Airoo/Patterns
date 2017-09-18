package ru.javago.behavioral.mediator.source;

import ru.javago.behavioral.mediator.source.realization.ConcreteColleague1;
import ru.javago.behavioral.mediator.source.realization.ConcreteColleague2;
import ru.javago.behavioral.mediator.source.realization.ConcreteMediator;

public class Main {

    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.send("How are you?");
        c2.send("Fine, thanks");
    }
}
