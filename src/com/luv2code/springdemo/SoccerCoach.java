package com.luv2code.springdemo;

public class SoccerCoach implements Coach {

    private FortuneService fortuneService;
    public SoccerCoach(){

    }
    public SoccerCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Keep exercising everyday";
    }

    @Override
    public int getDailyFortune() {
        return fortuneService.getFortune();
    }
}
