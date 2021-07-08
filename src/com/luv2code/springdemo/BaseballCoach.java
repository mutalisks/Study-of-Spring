package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
    @Override
    //define a private field for the dependency
    public String getDailyWorkout(){
        return "spend 30 minutes on batting practice";
    }
    private FortuneService fortuneService;
    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public int getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
