package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{

    int[] fortunes = new int[]{100,1000,10000};

    @Override
    public int getFortune() {
        Random random = new Random();
        int index = random.nextInt(3);
        return fortunes[index];
    }
}
