package pl.matrasbartosz.command_pattern.task1.workshop.command;

import pl.matrasbartosz.command_pattern.task1.workshop.Robot;

public class RobotTurnOnCommand implements Command {

    private final Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.turnOn();
    }

    @Override
    public void undo() {
        this.robot.turnOff();
    }
}
