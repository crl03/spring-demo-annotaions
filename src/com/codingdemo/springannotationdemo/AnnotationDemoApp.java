package com.codingdemo.springannotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

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
