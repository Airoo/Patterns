package ru.javago.generative.singleton.source;

import ru.javago.generative.singleton.source.singletons.SingletonFour;
import ru.javago.generative.singleton.source.singletons.SingletonOne;
import ru.javago.generative.singleton.source.singletons.SingletonThree;
import ru.javago.generative.singleton.source.singletons.SingletonTwo;

public class Main {

    public static void main(String[] args) {
        SingletonOne instanceOne = SingletonOne.INSTANCE;
        SingletonTwo instanceTwo = SingletonTwo.getInstance();
        SingletonThree singletonThree = SingletonThree.getInstance();
        SingletonFour instanceFour = SingletonFour.INSTANCE;
    }
}
