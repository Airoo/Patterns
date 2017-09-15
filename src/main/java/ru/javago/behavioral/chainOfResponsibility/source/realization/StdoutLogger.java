package ru.javago.behavioral.chainOfResponsibility.source.realization;

import ru.javago.behavioral.chainOfResponsibility.source.base.Logger;

public class StdoutLogger extends Logger {
    public StdoutLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Writing to stdout: " + msg);
    }
}
