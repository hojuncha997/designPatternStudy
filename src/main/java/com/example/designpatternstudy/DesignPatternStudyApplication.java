package com.example.designpatternstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //DB 없이 구동
public class DesignPatternStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternStudyApplication.class, args);
    }

}
