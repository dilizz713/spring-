package lk.ijse.gdse71.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanThree {
    @Bean
    public SpringBeanOne springBeanOne() {
     /*   SpringBeanTwo springBeanTwo1 = new SpringBeanTwo();
        SpringBeanTwo springBeanTwo2 = new SpringBeanTwo();*/

        SpringBeanTwo springBeanTwo1 = springBeanTwo();             //InterBean Dependency doesn't satisfied
        SpringBeanTwo springBeanTwo2 = springBeanTwo();              //InterBean Dependency doesn't satisfied

        System.out.println(springBeanTwo1);
        System.out.println(springBeanTwo2);

        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }
}
