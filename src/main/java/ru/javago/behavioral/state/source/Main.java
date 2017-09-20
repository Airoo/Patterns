package ru.javago.behavioral.state.source;

import ru.javago.behavioral.state.source.base.Context;
import ru.javago.behavioral.state.source.realization.StartState;
import ru.javago.behavioral.state.source.realization.StopState;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
