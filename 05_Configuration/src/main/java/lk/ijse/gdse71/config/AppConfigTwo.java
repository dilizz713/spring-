package lk.ijse.gdse71.config;

import lk.ijse.gdse71.bean.SpringBeanOne;
import lk.ijse.gdse71.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTwo {
    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }
}
