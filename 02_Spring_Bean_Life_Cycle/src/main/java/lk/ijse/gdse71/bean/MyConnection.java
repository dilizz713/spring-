package lk.ijse.gdse71.bean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MyConnection implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    //01.the state of instantiation
    public MyConnection() {
        System.out.println("01.MyConnection constructor");
    }
    //02.there is no method to find state of populate properties

    //03.bean name aware - bean id
    @Override
    public void setBeanName(String name) {
        System.out.println("03.Bean name aware");
    }

    //04. bean factory aware - adding dependency injection into the bean
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("04.Bean factory aware");
    }

    //05. application context aware - adding AOP and DP
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("05.Application context aware");
    }

    //06 . bean initializing
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("06.Initializing Bean");
    }


    //07. - disposable bean - context close and remove all available beans from context
    @Override
    public void destroy() throws Exception {
        System.out.println("07.MyConnection destroy");
    }

    // PROTOTTYPE
   /* 01.MyConnection constructor
    03.Bean name aware
    04.Bean factory aware
    05.Application context aware
    06.Initializing Bean
    lk.ijse.gdse71.bean.MyConnection@229f66ed*/

    // singleton instance dekak cl weddi
   /* 01.MyConnection constructor
    03.Bean name aware
    04.Bean factory aware
    05.Application context aware
    06.Initializing Bean
    lk.ijse.gdse71.bean.MyConnection@3cd3e762
    lk.ijse.gdse71.bean.MyConnection@3cd3e762
    07.MyConnection destroy*/

// prototype beans wala instance dekak cl weddi
   /* 01.MyConnection constructor
    03.Bean name aware
    04.Bean factory aware
    05.Application context aware
    06.Initializing Bean
    lk.ijse.gdse71.bean.MyConnection@217ed35e
            01.MyConnection constructor
            03.Bean name aware
             04.Bean factory aware
            05.Application context aware
            06.Initializing Bean
            lk.ijse.gdse71.bean.MyConnection@7dcf94f8*/





}
