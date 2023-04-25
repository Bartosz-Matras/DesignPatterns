package pl.matrasbartosz.state_pattern.task1.state;

import pl.matrasbartosz.state_pattern.task1.state.NoCoinState;
import pl.matrasbartosz.state_pattern.task1.state.State;

public class CoffeeMachine {

    private State state;

    public CoffeeMachine() {
        state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pushTheButton() {
        state.pushTheButton(this);
    }

    public void takeTheCup() {
        state.takeTheCup(this);
    }

    public void returnTheCoin() {
        state.returnTheCoin(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
