package pl.matrasbartosz.memento_pattern.operating_system;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        System.out.println("Saved backup number: " + operatingSystemMemento.getBackupNumber()
                + " with date: " + operatingSystemMemento.getBackupDate());
        this.operatingSystemMemento = operatingSystemMemento;
    }

    public OperatingSystemMemento getMemento(){
        System.out.println("Loaded backup number: " + operatingSystemMemento.getBackupNumber()
                + " with date: " + operatingSystemMemento.getBackupDate());
        return this.operatingSystemMemento;
    }
}
