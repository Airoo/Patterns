package ru.javago.generative.abstractFactory.source;

import ru.javago.generative.abstractFactory.source.app.Application;
import ru.javago.generative.abstractFactory.source.factories.GUIFactory;
import ru.javago.generative.abstractFactory.source.factories.MacFactory;
import ru.javago.generative.abstractFactory.source.factories.WinFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory winFactory = new WinFactory();
        Application wintApplication = new Application(winFactory);
        wintApplication.paintButton();
        wintApplication.paintCheckbox();

        GUIFactory macFactory = new MacFactory();
        Application macApplication = new Application(macFactory);
        macApplication.paintButton();
        macApplication.paintCheckbox();
    }
}
