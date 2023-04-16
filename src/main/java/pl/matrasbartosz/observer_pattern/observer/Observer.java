package pl.matrasbartosz.observer_pattern.observer;

import pl.matrasbartosz.observer_pattern.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
