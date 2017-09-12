package ru.javago.generative.builder.source;

import ru.javago.generative.builder.source.builders.HawaiianPizzaBuilder;
import ru.javago.generative.builder.source.builders.PizzaBuilder;
import ru.javago.generative.builder.source.controller.Waiter;
import ru.javago.generative.builder.source.model.Pizza;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza.toString());
    }
}
