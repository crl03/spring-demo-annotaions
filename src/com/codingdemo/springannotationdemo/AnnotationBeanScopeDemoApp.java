package com.codingdemo.springannotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach otherCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach == otherCoach);

        System.out.println("theCoach" + theCoach);
        System.out.println("otherCoach" + otherCoach);
        System.out.println(result);
    }
}
