package lk.ijse.gdse71.config;

import lk.ijse.gdse71.bean.E;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse71.bean")
@Import({AppConfigOne.class, AppConfigTwo.class})
/*@ImportResource("classpath:hibernate.cfg.xml")
@ImportResource("file:absolute-path-of-hibernate.cfg.xml")*/
public class AppConfig {

}
