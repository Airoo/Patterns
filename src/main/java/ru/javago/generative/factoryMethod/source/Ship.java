package ru.javago.generative.factoryMethod.source;

public class Ship implements Transport{
    public void deliver(String cargo, String place) {
        System.out.println("This is Ship");
    }
}
