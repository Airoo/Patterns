package ru.javago.structural.adapter.source.inheritance;

public class Main {

    public static void main(String[] args) {
        Chief chief = new ChiefAdapter();
        chief.makeBreakfast();
    }
}
