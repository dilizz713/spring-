package lk.ijse.gdse71.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse71.bean , lk.ijse.gdse71.controller")
@EnableWebMvc
public class WebAppConfig {

}
