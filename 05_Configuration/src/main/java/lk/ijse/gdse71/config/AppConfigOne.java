package lk.ijse.gdse71.config;

import lk.ijse.gdse71.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse71.bean")
public class AppConfigOne {

    @Bean
    public SpringBeanOne springBeanOne() {
        return new SpringBeanOne();
    }
}
