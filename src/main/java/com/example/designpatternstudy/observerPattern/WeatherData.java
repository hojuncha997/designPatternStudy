//Subject 인터페이스 구현하기

package com.example.designpatternstudy.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{ //Subject인터페이스 구현
    private List<ObserverForObserverPattern> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<ObserverForObserverPattern>();
    }

    @Override
    public void registerObserver(ObserverForObserverPattern observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverForObserverPattern observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        //모든 옵저버에게 상태 변화를 알려주는 부분
        //모두 ObserverForObserverPattern인터페이스를 구현하는 객체들이므로
        //update()메소드를 통해 손쉽게 상태 변화를 알려줄 수 있다.
        for (ObserverForObserverPattern observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measuirementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measuirementsChanged();
    }



}
