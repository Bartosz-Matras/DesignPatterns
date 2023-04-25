package pl.matrasbartosz.command_pattern.task1.workshop.command;

import pl.matrasbartosz.command_pattern.task1.workshop.CoffeeMarker;

public class CoffeeMarkerTurnOffCommand implements Command {

    private final CoffeeMarker coffeeMarker;

    public CoffeeMarkerTurnOffCommand(CoffeeMarker coffeeMarker) {
        this.coffeeMarker = coffeeMarker;
    }

    @Override
    public void execute() {
        this.coffeeMarker.turnOff();
    }

    @Override
    public void undo() {
        this.coffeeMarker.turnOn();
    }
}
