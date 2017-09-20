package ru.javago.behavioral.state.source.realization;

import ru.javago.behavioral.state.source.base.Context;
import ru.javago.behavioral.state.source.base.State;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }

}
