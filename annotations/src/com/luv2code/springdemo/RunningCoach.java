package com.luv2code.springdemo;

public class RunningCoach implements Coach{

    private FortuneService fortuneService;
    public RunningCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "!!!!!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
