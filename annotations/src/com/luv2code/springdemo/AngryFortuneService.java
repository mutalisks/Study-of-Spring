package com.luv2code.springdemo;

public class AngryFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Angry!";
    }
}
