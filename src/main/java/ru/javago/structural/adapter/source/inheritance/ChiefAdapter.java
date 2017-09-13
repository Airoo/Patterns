package ru.javago.structural.adapter.source.inheritance;

public class ChiefAdapter extends Plumber implements Chief {

    @Override
    public Object makeBreakfast() {
        return getKey();
    }

    @Override
    public Object makeDinner() {
        return getPipe();
    }

    @Override
    public Object makeSupper() {
        return getScrewDriver();
    }
}
