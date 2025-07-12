package lk.ijse.gdse71.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl2 implements Agreement{

    @Override
    public void chat() {
        System.out.println("Girl 2 constructor called");
    }
}
