package lk.ijse.gdse71.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
    public TestBean2() {
        System.out.println("TestBean2 constructor Called");
    }
}
