package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Do something";
    }

    @Override
    public String getDailyFortune() {
        return "Lucky";
    }
}
