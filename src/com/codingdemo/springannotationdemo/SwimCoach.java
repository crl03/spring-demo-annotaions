package com.codingdemo.springannotationdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    @Value("${info.email}")
    private String email;

    @Value("${info.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.setFortuneService(fortuneService);
    }

    public SwimCoach(FortuneService fortuneService, String email, String team) {
        this.setEmail(email);
        this.setTeam(team);
        this.setFortuneService(fortuneService);
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Don't drown!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
