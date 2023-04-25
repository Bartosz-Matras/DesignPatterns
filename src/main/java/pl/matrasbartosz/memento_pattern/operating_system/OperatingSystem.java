package pl.matrasbartosz.memento_pattern.operating_system;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber = 0;
    private Date backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Create backup number: " + this.backupNumber + " with date: " + this.backupDate);
    }

    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load(OperatingSystemMemento operatingSystemMemento) {
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupDate = operatingSystemMemento.getBackupDate();
    }
}
