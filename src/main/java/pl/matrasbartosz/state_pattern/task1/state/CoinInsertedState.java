package pl.matrasbartosz.state_pattern.task1.state;

class CoinInsertedState implements State {
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Coin is already inserted");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Pouring coffee");
        coffeeMachine.setState(new CupFullState());
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Press the button");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Returning the coint");
        coffeeMachine.setState(new NoCoinState());
    }
}
