package lk.ijse.gdse71.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware , InitializingBean , DisposableBean {
    public SpringBeanOne() {
        System.out.println("SpringBeanOne constructor called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanOne setBeanFactory called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanOne setBeanName called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanOne destroy called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanOne afterPropertiesSet called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanOne setApplicationContext called");
    }
}
