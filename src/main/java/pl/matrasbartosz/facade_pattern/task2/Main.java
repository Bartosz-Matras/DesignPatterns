package pl.matrasbartosz.facade_pattern.task2;

import pl.matrasbartosz.facade_pattern.task2.bank.AtmMachineFacade;

class Main {

    public static void main(String[] args) {
        AtmMachineFacade atmMachineFacade = AtmMachineFacade.getInstance();
        atmMachineFacade.withdrawMoney();
    }
}
