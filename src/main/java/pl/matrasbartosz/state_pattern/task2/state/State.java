package pl.matrasbartosz.state_pattern.task2.state;

interface State {
    void insertTheCoin(SlotMachine context);
    void pushTheLever(SlotMachine context);
    void collectTheWinnings(SlotMachine context);
    void currentState(SlotMachine context);

}
