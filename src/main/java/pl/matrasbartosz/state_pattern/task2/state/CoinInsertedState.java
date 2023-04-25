package pl.matrasbartosz.state_pattern.task2.state;

import java.util.Random;

class CoinInsertedState implements State {

    private static final Random random = new Random();
    private static CoinInsertedState instance;

    private CoinInsertedState() {}

    public static CoinInsertedState getInstance() {
        if (instance == null) {
            instance = new CoinInsertedState();
        }
        return instance;
    }

    @Override
    public void insertTheCoin(SlotMachine context) {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void pushTheLever(SlotMachine context) {
        System.out.println("Wait...");
        int result = random.nextInt(99);
        if (result < 20) {
            System.out.println("You win! Collect your money");
            context.state = WinState.getInstance();
        }else {
            System.out.println("You lose. Try next time.");
            context.state = NoCoinState.getInstance();
        }
    }

    @Override
    public void collectTheWinnings(SlotMachine context) {
        System.out.println("Push the lever to check your luck.");
    }

    @Override
    public void currentState(SlotMachine context) {
        System.out.println("Current state - COIN INSERTED STATE");
    }
}
