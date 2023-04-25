package pl.matrasbartosz.state_pattern.task1.state;

interface State {
    void insertTheCoin(CoffeeMachine coffeeMachine);
    void pushTheButton(CoffeeMachine coffeeMachine);
    void takeTheCup(CoffeeMachine coffeeMachine);
    void returnTheCoin(CoffeeMachine coffeeMachine);
}
