package pl.matrasbartosz.state_pattern.task2.state;

class WinState implements State {

    private static WinState instance;

    private WinState() {}

    public static WinState getInstance() {
        if (instance == null) {
            instance = new WinState();
        }
        return instance;
    }

    @Override
    public void insertTheCoin(SlotMachine context) {
        System.out.println("Collect your reward before next game.");
    }

    @Override
    public void pushTheLever(SlotMachine context) {
        System.out.println("Collect your reward before next game.");
    }

    @Override
    public void collectTheWinnings(SlotMachine context) {
        System.out.println("Collected coin. Congrats!");
        context.state = NoCoinState.getInstance();
    }

    @Override
    public void currentState(SlotMachine context) {
        System.out.println("Current state - WIN STATE");
    }
}
