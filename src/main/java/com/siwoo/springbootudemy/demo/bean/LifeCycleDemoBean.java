package com.siwoo.springbootudemy.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("#setBeanName(name:" + name + ")");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("#destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("#afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#setApplicationContext");
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("#postConstruct");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("#preDestroy");
    }

    public void beforeInit() {
        System.out.println("#beforeInit");
    }

    public void afterInit() {
        System.out.println("#afterInit");
    }
}
