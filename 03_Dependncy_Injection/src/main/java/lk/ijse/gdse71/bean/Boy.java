package lk.ijse.gdse71.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Qualifier("girl2")
    @Autowired
    Agreement girl;

    public Boy(){
        System.out.println("Boy constructor called");
    }
    public void chatWithGirl(){
      /*  Girl girl = new Girl();*/
        girl.chat();
    }

}
