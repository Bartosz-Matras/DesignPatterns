package pl.matrasbartosz.state_pattern.task2;

import pl.matrasbartosz.state_pattern.task2.state.SlotMachine;

class Main {

    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();

        slotMachine.insertTheCoin();
        slotMachine.currentState();
        slotMachine.pushTheLever();
        slotMachine.currentState();
        slotMachine.collectTheWinnings();
        slotMachine.currentState();
    }
}
