package ru.javago.generative.abstractFactory.source.factories;

import ru.javago.generative.abstractFactory.source.buttons.Button;
import ru.javago.generative.abstractFactory.source.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
