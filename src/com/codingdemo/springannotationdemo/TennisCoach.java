package com.codingdemo.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// you can specify beanID by @Component("theCoach")
// or you can leave it to default wich will take class name and make first letter lowercase: tennisCoach
@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Inside Tennis: default constructor.");
    }

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.setFortuneService(fortuneService);
//    }

    public FortuneService getFortuneService() {
        return this.fortuneService;
    }

    // doesn't have to be a setter for @Autowired
//    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside Tennis: setFortuneService()");
        this.fortuneService = fortuneService;
    }

    // the only caveat is it still has to set the variable
//    @Autowired
//    public void useFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyFortune() {
        return this.getFortuneService().getFortune() + " Ace!";
    }

    @Override
    public String getDailyWorkout() {
        return "Volley!";
    }
}
