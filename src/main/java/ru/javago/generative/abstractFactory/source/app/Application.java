package ru.javago.generative.abstractFactory.source.app;

import ru.javago.generative.abstractFactory.source.buttons.Button;
import ru.javago.generative.abstractFactory.source.checkboxes.Checkbox;
import ru.javago.generative.abstractFactory.source.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paintButton(){
        button.paint();
    }

    public void paintCheckbox(){
        checkbox.paint();
    }
}
