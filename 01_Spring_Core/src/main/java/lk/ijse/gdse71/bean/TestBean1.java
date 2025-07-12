package lk.ijse.gdse71.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("example")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)          // or @Scope("prototype")
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean1 Constructor Called");
    }
}
