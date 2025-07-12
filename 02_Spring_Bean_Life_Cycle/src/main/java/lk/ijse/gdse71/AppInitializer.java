package lk.ijse.gdse71;

import lk.ijse.gdse71.bean.MyConnection;
import lk.ijse.gdse71.bean.TestBean1;
import lk.ijse.gdse71.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        MyConnection myConnection1 = context.getBean(MyConnection.class);
        System.out.println(myConnection1);


        MyConnection myConnection2 = context.getBean(MyConnection.class);
        System.out.println(myConnection2);



        context.registerShutdownHook();
    }
}