package com.codingdemo.springannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// for demo if not using the SwimJavaConfigDemoApp.java for main then uncomment the @ComponentScan
//@ComponentScan("com.codingdemo.springannotationdemo")
@PropertySource("classpath:coach.properties")
public class SportConfig {

    // define bean for sadFortuneService
    // the method name will be the bean ID
    @Bean
    public FortuneService sadFortuneService() {
        return  new SadFortuneService();
    }

    // define bean for swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        // we are calling the above method of the same name into the swim coach
        return new SwimCoach(sadFortuneService());
    }
}
