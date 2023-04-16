package pl.matrasbartosz.observer_pattern;

import pl.matrasbartosz.observer_pattern.observer.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
