package pl.matrasbartosz.visitor_pattern.task1.visitor;

import pl.matrasbartosz.visitor_pattern.task1.activity.Squash;
import pl.matrasbartosz.visitor_pattern.task1.activity.Treadmill;
import pl.matrasbartosz.visitor_pattern.task1.activity.Weights;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running on treadmill: "
                + treadmill.getDistance() * 5);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights: "
                + weights.getWeight() * weights.getReps() * 2);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash: "
                + squash.getMinutesPlayed() * 20);
    }
}
