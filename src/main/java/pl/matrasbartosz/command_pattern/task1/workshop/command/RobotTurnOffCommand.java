package pl.matrasbartosz.command_pattern.task1.workshop.command;

import pl.matrasbartosz.command_pattern.task1.workshop.Robot;

public class RobotTurnOffCommand implements Command {

    private final Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.turnOff();
    }

    @Override
    public void undo() {
        this.robot.turnOn();
    }
}
