package pl.matrasbartosz.command_pattern.task1.workshop.command;

import pl.matrasbartosz.command_pattern.task1.workshop.CoffeeMarker;

public class CoffeeMarkerTurnOnCommand implements Command {

    private final CoffeeMarker coffeeMarker;

    public CoffeeMarkerTurnOnCommand(CoffeeMarker coffeeMarker) {
        this.coffeeMarker = coffeeMarker;
    }

    @Override
    public void execute() {
        this.coffeeMarker.turnOn();
    }

    @Override
    public void undo() {
        this.coffeeMarker.turnOff();
    }
}
