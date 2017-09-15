package ru.javago.behavioral.command.source.command;

import ru.javago.behavioral.command.source.model.Light;

public class TurnOnLightCommand implements Command {
    private Light theLight;

    public TurnOnLightCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}
