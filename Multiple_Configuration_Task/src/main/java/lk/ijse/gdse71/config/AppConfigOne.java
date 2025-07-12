package lk.ijse.gdse71.config;

import lk.ijse.gdse71.bean.A;
import lk.ijse.gdse71.bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigOne {
    @Bean
    public A a(){
        return new A();
    }

    @Bean
    public B b(){
        return new B();
    }
}
