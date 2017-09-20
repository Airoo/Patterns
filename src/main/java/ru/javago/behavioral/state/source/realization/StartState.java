package ru.javago.behavioral.state.source.realization;

import ru.javago.behavioral.state.source.base.Context;
import ru.javago.behavioral.state.source.base.State;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
