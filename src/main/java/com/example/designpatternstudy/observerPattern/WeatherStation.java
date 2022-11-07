package com.example.designpatternstudy.observerPattern;

public class WeatherStation {

    public static void main(String[] args) {

        //weatherData 객체 생성
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        //3개의 디스플레이를 생성하고 weatherData 객체를 인자로 전달
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        //아래의 setMeasurements를 새로운 측정값으로 가정한다.
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);


    }


}
