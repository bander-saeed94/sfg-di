package saeed.bander.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## LifeCycleDemoBean Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## the lifecycle has been terminated");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## the lifecycle has its afterPropertiesSet");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## Bean name is: " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The postConstruct annoted method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The preDestroy annoted method has been called");
    }


}
