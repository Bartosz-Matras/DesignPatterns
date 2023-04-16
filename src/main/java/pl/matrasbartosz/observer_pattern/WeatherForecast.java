package pl.matrasbartosz.observer_pattern;

import pl.matrasbartosz.observer_pattern.observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    private final Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void updateForecast(int temperature, int pressure) {
        setPressure(pressure);
        setTemperature(temperature);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers){
            observer.updateForecast(this);
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
