package org.mohammed.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.format("Current Conditions: %sF and %s%% humidity\n", temp, humidity);
    }

    @Override
    public void update() {
        temp = weatherData.getTemp();
        humidity = weatherData.getHumidity();
        display();
    }
}
