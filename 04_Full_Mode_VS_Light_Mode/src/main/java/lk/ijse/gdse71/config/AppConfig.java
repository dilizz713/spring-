package lk.ijse.gdse71.config;

import lk.ijse.gdse71.bean.SpringBeanOne;
import lk.ijse.gdse71.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse71.bean")
public class AppConfig {

    /*@Bean
    public SpringBeanOne springBeanOne() {
     *//*   SpringBeanTwo springBeanTwo1 = new SpringBeanTwo();
        SpringBeanTwo springBeanTwo2 = new SpringBeanTwo();*//*

        SpringBeanTwo springBeanTwo1 = springBeanTwo();             //InterBean Dependency
        SpringBeanTwo springBeanTwo2 = springBeanTwo();              //InterBean Dependency
        System.out.println(springBeanTwo1);
        System.out.println(springBeanTwo2);

        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }*/
}
