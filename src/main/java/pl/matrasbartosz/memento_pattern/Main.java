package pl.matrasbartosz.memento_pattern;

import pl.matrasbartosz.memento_pattern.operating_system.OperatingSystem;
import pl.matrasbartosz.memento_pattern.operating_system.OperatingSystemCaretaker;

class Main {

    public static void main(String[] args) throws InterruptedException {
        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();

        operatingSystem.createBackup();
        Thread.sleep(3000);

        operatingSystem.createBackup();
        Thread.sleep(3000);

        operatingSystemCaretaker.addMemento(operatingSystem.save());

        operatingSystem.createBackup();
        Thread.sleep(3000);

        operatingSystem.createBackup();
        Thread.sleep(3000);

        operatingSystem.load(operatingSystemCaretaker.getMemento());
    }
}
