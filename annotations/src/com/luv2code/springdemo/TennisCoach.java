package com.luv2code.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.print.attribute.standard.MediaSize;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("testFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }

    //define my init method
    @PostConstruct
    public void doMystartupStuff(){
        System.out.println(">>TennisCoach: inside of doMystartupStuff");
    }
    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">>TennisCoach: inside of doMyCleanupStuff");
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
