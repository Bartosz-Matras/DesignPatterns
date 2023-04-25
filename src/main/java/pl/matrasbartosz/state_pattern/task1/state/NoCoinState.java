package pl.matrasbartosz.state_pattern.task1.state;

class NoCoinState implements State {
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Inserted coin");
        coffeeMachine.setState(new CoinInsertedState());
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Insert the coin");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Insert the coin");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Insert the coin");
    }
}
