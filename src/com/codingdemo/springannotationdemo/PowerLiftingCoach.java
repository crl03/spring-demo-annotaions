package com.codingdemo.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PowerLiftingCoach implements Coach{

    @Autowired
    @Qualifier("restFortuneService")
    private FortuneService fortuneService;

    @Value("${info.email}")
    private String email;

    @Value("${info.team}")
    private String team;

    public PowerLiftingCoach () {

    }

    public PowerLiftingCoach(FortuneService fortuneService, String email, String team) {
        this.setFortuneService(fortuneService);
        this.setEmail(email);
        this.setTeam(team);
    }

    public FortuneService getFortuneService() {
        return this.fortuneService;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTeam() {
        return this.team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    @Override
    public String getDailyWorkout() {
        return "SQUAT, DEAD BENCH!";
    }

    @Override
    public String getDailyFortune() {
        return this.getFortuneService().getFortune() + " LIGHT WEIGHT BABY!";
    }
}
