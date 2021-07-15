package com.luv2code.springdemo;

public class SadFortunateService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
