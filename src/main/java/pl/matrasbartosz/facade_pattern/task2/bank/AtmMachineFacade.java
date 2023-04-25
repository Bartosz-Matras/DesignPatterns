package pl.matrasbartosz.facade_pattern.task2.bank;

public class AtmMachineFacade {

    private static AtmMachineFacade instance;
    private final AtmMachine atmMachine;
    private final BankSystem bankSystem;

    private AtmMachineFacade() {
        this.atmMachine = new AtmMachine();
        this.bankSystem = new BankSystem();
    }

    public static AtmMachineFacade getInstance() {
        if (instance == null) {
            instance = new AtmMachineFacade();
        }
        return instance;
    }

    public void withdrawMoney() {
        atmMachine.enterPin();
        if (bankSystem.validatePin()
                && bankSystem.validateTransaction()) {
            atmMachine.withdrawCash();
        }
    }

}
