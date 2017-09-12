package ru.javago.generative.abstractFactory.source.factories;

import ru.javago.generative.abstractFactory.source.buttons.Button;
import ru.javago.generative.abstractFactory.source.buttons.MacButton;
import ru.javago.generative.abstractFactory.source.checkboxes.Checkbox;
import ru.javago.generative.abstractFactory.source.checkboxes.MacCheckbox;

public class MacFactory implements GUIFactory{
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
