package pl.matrasbartosz.observer_pattern.observer;

import pl.matrasbartosz.observer_pattern.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet: new weather forecast: temperature: " + weatherForecast.getTemperature()
                + " degrees, pressure: " + weatherForecast.getPressure() + "hPa");
    }
}
