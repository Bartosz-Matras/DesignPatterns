package pl.matrasbartosz.observer_pattern.observer;

import pl.matrasbartosz.observer_pattern.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio: new weather forecast: temperature: " + weatherForecast.getTemperature()
                + " degrees, pressure: " + weatherForecast.getPressure() + "hPa");
    }
}
