package ru.javago.behavioral.chainOfResponsibility.source.realization;

import ru.javago.behavioral.chainOfResponsibility.source.base.Logger;

public class StderrLogger extends Logger {
    public StderrLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending to stderr: " + msg);
    }
}
