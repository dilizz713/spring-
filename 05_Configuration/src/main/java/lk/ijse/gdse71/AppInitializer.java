package lk.ijse.gdse71;

import lk.ijse.gdse71.bean.SpringBeanOne;
import lk.ijse.gdse71.bean.SpringBeanTwo;
import lk.ijse.gdse71.config.AppConfigOne;
import lk.ijse.gdse71.config.AppConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfigOne.class);
        context.register(AppConfigTwo.class);

        context.refresh();

        SpringBeanOne beanOne1 = context.getBean(SpringBeanOne.class);
        SpringBeanOne beanOne2 = context.getBean(SpringBeanOne.class);

        System.out.println("beanOne1: " + beanOne1);
        System.out.println("beanOne2: " + beanOne2);

        SpringBeanTwo beanTwo1 = context.getBean(SpringBeanTwo.class);
        SpringBeanTwo beanTwo2 = context.getBean(SpringBeanTwo.class);

        System.out.println("beanTwo1: " + beanTwo1);
        System.out.println("beanTwo2: " + beanTwo2);



        context.registerShutdownHook();
    }
}