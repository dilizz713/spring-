package lk.ijse.gdse71;

import lk.ijse.gdse71.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        // -----------------------SYSTEM VARIABLES--------------------------------------

        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
           /* System.out.println(key + "=" + getenv.get(key));*/
        }

        //System.out.println(getenv.get("OS"));           // os type



        // -----------------------PREDEFINE JAVA PROPERTIES --------------------------------------
      //  System.getProperties().list(System.out);



        // -----------------------RESOURCES BUNDLE --------------------------------------
        /* resources folder eke thmy me environment eka thiyenne*/

        context.registerShutdownHook();
    }
}