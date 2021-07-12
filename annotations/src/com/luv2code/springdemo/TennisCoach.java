package com.luv2code.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.MediaSize;

@Component
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("testFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }
    /*
    @Autowired
    public void doSome(FortuneService theFortuneService){
        System.out.println(">> TennisCoach: inside method");
        fortuneService = theFortuneService;
    }
    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
     */
    @Override
    public String getDailyWorkout() {
        return "practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
