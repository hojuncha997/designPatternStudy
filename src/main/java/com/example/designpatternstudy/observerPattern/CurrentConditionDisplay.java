//CurrentConditionDisplay.java

package com.example.designpatternstudy.observerPattern;

//weatherData객체로부터 변경사항을 받으려면 ObserverForObserverPattern을 구현해야 한다.
// API구조상 모든 디스플레이 항목에서 DisplayElement를 구현하기로 했기에 DisplayElement도 구현한다.

public class CurrentConditionDisplay implements ObserverForObserverPattern, DisplayElement{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    //생성자에 weatherData라는 주제(Subject)가 전달되며, 그 객체를 써서 디스플레이를 옵저버로 등록한다.
    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override //ObserverForObserverPattern으로부터
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override //DisplayElement로부터
    public void display() { // 가장 최근에 받은 온도와 습도 출력
        System.out.println("현재 상태: 온도 "
                + temperature + "F, 습도 " + humidity + "%");

    }


}
