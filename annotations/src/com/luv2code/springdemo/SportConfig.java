package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortunateService();
    }
    //define bean for our swim coach AND inject dependency
    @Bean
    public Coach runningCoach(){
        return new RunningCoach(sadFortuneService());
    }
}