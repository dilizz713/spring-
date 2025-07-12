package lk.ijse.gdse71.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)      // or @Scope("prototype")
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring bean constructor called");
    }

    public void test(){
        System.out.println("test");
    }
}
