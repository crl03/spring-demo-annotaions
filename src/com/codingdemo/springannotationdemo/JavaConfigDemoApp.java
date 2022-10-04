package com.codingdemo.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get bean from spring container
        Coach tcoach = context.getBean("tennisCoach", Coach.class);
        PowerLiftingCoach pcoach = context.getBean("powerLiftingCoach", PowerLiftingCoach.class);

        // call method on bean
        System.out.println(tcoach.getDailyWorkout());
        System.out.println(tcoach.getDailyFortune());
        System.out.println(pcoach.getDailyWorkout());
        System.out.println(pcoach.getDailyFortune());
        System.out.println(pcoach.getTeam());
        // close the context
        context.close();
    }
}
