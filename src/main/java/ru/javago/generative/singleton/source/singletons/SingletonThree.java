package ru.javago.generative.singleton.source.singletons;

public class SingletonThree {
    private static final SingletonThree INSTANCE = new SingletonThree();

    private SingletonThree(){}

    public static SingletonThree getInstance(){
        return INSTANCE;
    }
}
