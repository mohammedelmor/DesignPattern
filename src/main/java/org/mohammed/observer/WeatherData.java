package org.mohammed.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }



    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers) {
            o.update();;
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
