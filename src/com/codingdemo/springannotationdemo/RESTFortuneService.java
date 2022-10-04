package com.codingdemo.springannotationdemo;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("restFortuneService")
public class RESTFortuneService implements FortuneService{

    private String fortuneFile = "C:\\Users\\cloja\\IdeaProjects\\spring-demo-annotaions\\src\\fortunes.txt";
    private List<String> fortunes;
    private Random random = new Random();


    @Override
    public String getFortune() {

    File file = new File(fortuneFile);

    fortunes = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(fortuneFile))) {
            String tempLine;

            while ((tempLine = br.readLine()) != null){
                fortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        int index = random.nextInt(fortunes.size());
        //String theFortune = fortunes.get(index);
        return fortunes.get(index);
    }
}
