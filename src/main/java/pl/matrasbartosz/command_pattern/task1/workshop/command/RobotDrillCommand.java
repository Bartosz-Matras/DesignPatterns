package pl.matrasbartosz.command_pattern.task1.workshop.command;

import pl.matrasbartosz.command_pattern.task1.workshop.Robot;

public class RobotDrillCommand implements Command {

    private final Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.drill();
    }

    @Override
    public void undo() {

    }
}
