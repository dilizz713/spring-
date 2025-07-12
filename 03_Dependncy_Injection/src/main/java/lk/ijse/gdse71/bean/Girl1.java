package lk.ijse.gdse71.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl1 implements Agreement{
    public Girl1() {
        System.out.println("Girl1 constructor called");
    }

    public void chat(){
        System.out.println("Girl chatting");
    }
}
