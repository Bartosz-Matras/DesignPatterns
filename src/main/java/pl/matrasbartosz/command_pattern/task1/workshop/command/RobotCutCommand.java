package pl.matrasbartosz.command_pattern.task1.workshop.command;

import pl.matrasbartosz.command_pattern.task1.workshop.Robot;

public class RobotCutCommand implements Command {

    private final Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.cut();
    }

    @Override
    public void undo() {

    }

}
