package lk.ijse.gdse71.config;

import lk.ijse.gdse71.bean.MyConnection;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages =  "lk.ijse.gdse71.bean")
public class AppConfig {
   /* @Bean
    public MyConnection getMyConnection() {
        return new MyConnection();
    }*/

    @Bean("example1")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)             // or @Scope("prototype")
    public MyConnection myConnection() {
        return new MyConnection();
    }

}
