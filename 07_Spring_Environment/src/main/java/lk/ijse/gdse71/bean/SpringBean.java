package lk.ijse.gdse71.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("${os.name}")            //key eka
   private String oSName;

    // resources bundle bean ekt add karanne mehema
    @Value("${db.name}")
    private String userName;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(oSName);
        System.out.println(userName);
    }
}
