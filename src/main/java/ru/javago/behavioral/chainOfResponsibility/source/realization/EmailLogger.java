package ru.javago.behavioral.chainOfResponsibility.source.realization;

import ru.javago.behavioral.chainOfResponsibility.source.base.Logger;

public class EmailLogger extends Logger {
    public EmailLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }
}
