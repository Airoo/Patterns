package ru.javago.behavioral.command.source;

import ru.javago.behavioral.command.source.command.Command;
import ru.javago.behavioral.command.source.command.TurnOnLightCommand;
import ru.javago.behavioral.command.source.command.TurnOffLightCommand;
import ru.javago.behavioral.command.source.model.Light;
import ru.javago.behavioral.command.source.model.Switch;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Command switchUp = new TurnOnLightCommand(light);
        Command switchDown = new TurnOffLightCommand(light);

        Switch switchLigth = new Switch(switchUp, switchDown);

        switchLigth.flipUp();
        switchLigth.flipDown();
    }
}
