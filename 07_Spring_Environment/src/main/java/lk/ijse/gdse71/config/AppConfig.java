package lk.ijse.gdse71.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse71.bean")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
