package lk.ijse.gdse71.config;


import lk.ijse.gdse71.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages =  "lk.ijse.gdse71.bean")
public class AppConfig {

    @Bean
    @Scope("prototype")
    public MyConnection getMyConnection() {
        return new MyConnection();
    }
}
