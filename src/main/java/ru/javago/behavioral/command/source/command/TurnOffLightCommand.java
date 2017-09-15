package ru.javago.behavioral.command.source.command;

import ru.javago.behavioral.command.source.model.Light;

public class TurnOffLightCommand implements Command {
    private Light theLight;

    public TurnOffLightCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}
