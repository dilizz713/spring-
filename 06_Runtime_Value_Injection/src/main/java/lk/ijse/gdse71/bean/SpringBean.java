package lk.ijse.gdse71.bean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
   /* @Autowired(required = false)
    public SpringBean(@Value("dilini") String name ,@Value("23") int age, @Value("true") boolean value) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Value: " + value);
    }

    *//*public SpringBean() {
        System.out.println("SpringBean constructor");
    }*//*

    @Autowired(required = false)
    public SpringBean(@Value("kamal") String name , @Value("panadura") String address ,@Value("23") int age, @Value("true") boolean value) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Value: " + value);
    }*/

    @Value("dilini")
    private String name;

    public SpringBean() {
        System.out.println("Name: " + name);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Name: " + name);
    }
}
