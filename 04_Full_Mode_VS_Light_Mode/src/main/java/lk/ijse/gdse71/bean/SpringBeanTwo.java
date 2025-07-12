package lk.ijse.gdse71.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanTwo implements BeanNameAware , InitializingBean  , DisposableBean , ApplicationContextAware , BeanFactoryAware {
    public SpringBeanTwo() {
        System.out.println("SpringBeanTwo constructor called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanTwo setBeanFactory called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanTwo setBeanName called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanTwo destroy called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanTwo afterPropertiesSet called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanTwo setApplicationContext called");
    }
}
