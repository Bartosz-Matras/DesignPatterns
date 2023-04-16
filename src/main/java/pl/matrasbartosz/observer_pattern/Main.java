package pl.matrasbartosz.observer_pattern;

import pl.matrasbartosz.observer_pattern.observer.InternetNews;
import pl.matrasbartosz.observer_pattern.observer.RadioNews;
import pl.matrasbartosz.observer_pattern.observer.TvNews;

class Main {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);

        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);

        System.out.println("New weather forecast only for Internet:");

        weatherForecast.updateForecast(18, 1007);
    }
}
