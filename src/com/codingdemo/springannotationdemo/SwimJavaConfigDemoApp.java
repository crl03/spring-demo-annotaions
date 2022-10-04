package com.codingdemo.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        // HAD TO COMMENT OUT @ComponentScan from SportConfig.java to make sure that
        //      it only is using the beans defined in it
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get bean from spring container
        SwimCoach scoach = context.getBean("swimCoach", SwimCoach.class);

        // call method on bean
        System.out.println(scoach.getDailyWorkout());
        System.out.println(scoach.getDailyFortune());
        System.out.println("Email:\t" + scoach.getEmail());
        System.out.println("Team:\t" + scoach.getTeam());


        // close the context
        context.close();
    }
}
