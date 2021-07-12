package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class TestFortuneService implements FortuneService {

    private List<String> theFortunes;
    private Random myRandom = new Random();

    public TestFortuneService() {
        System.out.println(">> inside default constructor");
    }

    @PostConstruct
    private void loadTheFile() {
        System.out.println("inside the load method");
        String filename = "D:/spring/annotations/src/com/luv2code/springdemo/Luckys.txt";
        File theFile = new File(filename);
        System.out.println("Reading from file");
        System.out.println("File exists:" + theFile.exists());

        theFortunes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {
            String tempLine;
            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(theFortunes.size());
        return theFortunes.get(index);
    }
}
