package pl.matrasbartosz.command_pattern.task1.workshop;

import pl.matrasbartosz.command_pattern.task1.workshop.command.Command;
import pl.matrasbartosz.command_pattern.task1.workshop.command.RobotTurnOnCommand;

import java.util.ArrayList;
import java.util.List;

public class WorkShopApp {

    private final List<Command> commandQueue = new ArrayList<>();

    public void addToQueue(Command command) {
        commandQueue.add(command);
    }

    public void run() {
        if (commandQueue.isEmpty()) {
            System.out.println("Queue is empty");
        }

        for (Command command : commandQueue) {
            command.execute();
        }

        commandQueue.clear();
    }

    public void undoLastCommand(Robot robot) {
        commandQueue.add(new RobotTurnOnCommand(robot)); // only for testing purpose
        for (Command command : commandQueue) {
           command.undo();
        }
    }


}
