package com.codingdemo.springannotationdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    // create array of strings
    private String[] data = {
            "You will come into money.",
            "Sunshine for days.",
            "Get more sleep."
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
