package com.learn;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/learn/properties/Employee.properties")
@ComponentScan("com.learn")
public class AppConfig {
    //@Bean
    //public Accountant accountant()
    //{
    //    return new Accountant();
    //}
}
