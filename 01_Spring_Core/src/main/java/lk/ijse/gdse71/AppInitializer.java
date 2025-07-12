package lk.ijse.gdse71;

import lk.ijse.gdse71.bean.MyConnection;
import lk.ijse.gdse71.bean.SpringBean;
import lk.ijse.gdse71.bean.TestBean1;
import lk.ijse.gdse71.bean.TestBean2;
import lk.ijse.gdse71.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//
//        TestBean1 testBean1 = context.getBean(TestBean1.class);
//        System.out.println("Test Bean 1 id : " + testBean1);

        /*Runtime.getRuntime().addShutdownHook(new Thread() {                 //meka oni thenaka danna puluwan..
            public void run() {
                context.close();
            }
        });*/

        SpringBean springBean = context.getBean(SpringBean.class);          //class
        //springBean.test();
        System.out.println("Spring Bean id : " + springBean);

        SpringBean springBean1 = (SpringBean) context.getBean("springBean");        //id
        System.out.println("Spring Bean id : " + springBean1);

        SpringBean springBean2 = context.getBean("springBean", SpringBean.class);       // class and id
        System.out.println("Spring Bean id : " + springBean2);


        TestBean1 testBean1 = (TestBean1) context.getBean("example");           //change id
        System.out.println("TestBean1 id : " + testBean1);

        TestBean1 testBean2 = (TestBean1) context.getBean("example");
        System.out.println("TestBean1 id : " + testBean2);

        /*MyConnection myConnection = (MyConnection) context.getBean("myConnection");
        System.out.println("MyConnection id : " + myConnection);*/

        MyConnection myConnection1 = (MyConnection) context.getBean("example1", MyConnection.class);
        System.out.println("MyConnection id : " + myConnection1);

        MyConnection myConnection2 = context.getBean( MyConnection.class);
        System.out.println("MyConnection id : " + myConnection2);

        context.registerShutdownHook();            //same scenario

//
//        TestBean2 testBean2 = context.getBean(TestBean2.class);
//        System.out.println("Test Bean 2 id : " + testBean2);


    }
}