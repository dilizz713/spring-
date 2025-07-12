package lk.ijse.gdse71.config;

import lk.ijse.gdse71.bean.C;
import lk.ijse.gdse71.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTwo {
    @Bean
    public C c(){
        return new C();
    }

    @Bean
    public D d(){
        return new D();
    }
}
