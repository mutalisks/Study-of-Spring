package com.luv2code.springdemo;

public class MyApp {
    public static void main(String[] args){
        BaseballCoach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());

    }
}
