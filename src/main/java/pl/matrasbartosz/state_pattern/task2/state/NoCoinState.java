package pl.matrasbartosz.state_pattern.task2.state;

class NoCoinState implements State {

    private static NoCoinState instance;

    private NoCoinState() {}

    public static NoCoinState getInstance() {
        if (instance == null) {
            instance = new NoCoinState();
        }
        return instance;
    }

    @Override
    public void insertTheCoin(SlotMachine context) {
        System.out.println("Insert the coin");
        context.state = CoinInsertedState.getInstance();
    }

    @Override
    public void pushTheLever(SlotMachine context) {
        System.out.println("There no coin in slot machine.");
    }

    @Override
    public void collectTheWinnings(SlotMachine context) {
        System.out.println("There no coin in slot machine.");
    }

    @Override
    public void currentState(SlotMachine context) {
        System.out.println("Current state - NO COIN STATE");
    }
}
