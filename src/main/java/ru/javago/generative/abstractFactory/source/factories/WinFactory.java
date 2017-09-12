package ru.javago.generative.abstractFactory.source.factories;

import ru.javago.generative.abstractFactory.source.buttons.Button;
import ru.javago.generative.abstractFactory.source.buttons.WinButton;
import ru.javago.generative.abstractFactory.source.checkboxes.Checkbox;
import ru.javago.generative.abstractFactory.source.checkboxes.WinCheckbox;

public class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }

    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
