package pl.matrasbartosz.command_pattern.task1;

import pl.matrasbartosz.command_pattern.task1.workshop.CoffeeMarker;
import pl.matrasbartosz.command_pattern.task1.workshop.Robot;
import pl.matrasbartosz.command_pattern.task1.workshop.WorkShopApp;
import pl.matrasbartosz.command_pattern.task1.workshop.command.*;

class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkShopApp workShopApp = new WorkShopApp();
        workShopApp.addToQueue(new RobotTurnOnCommand(robot));
        workShopApp.addToQueue(new RobotCutCommand(robot));
        workShopApp.addToQueue(new RobotDrillCommand(robot));
        workShopApp.addToQueue(new RobotTurnOffCommand(robot));
        workShopApp.run();

        //-----------------
        workShopApp.run();

        CoffeeMarker coffeeMarker = new CoffeeMarker();
        workShopApp.addToQueue(new CoffeeMarkerTurnOnCommand(coffeeMarker));
        workShopApp.addToQueue(new CoffeeMarkerTurnOffCommand(coffeeMarker));
        workShopApp.run();


        workShopApp.addToQueue(new RobotTurnOnCommand(robot));
        workShopApp.run();
        workShopApp.undoLastCommand(robot);
    }
}
