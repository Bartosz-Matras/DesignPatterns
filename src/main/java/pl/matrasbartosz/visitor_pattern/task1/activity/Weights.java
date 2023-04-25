package pl.matrasbartosz.visitor_pattern.task1.activity;

import pl.matrasbartosz.visitor_pattern.task1.visitor.Visitor;

public class Weights implements Activity {

    private int weight;
    private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
