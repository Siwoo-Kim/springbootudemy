package com.siwoo.springbootudemy;

import com.siwoo.springbootudemy.demo.controllers.MyController;
import com.siwoo.springbootudemy.demo.controllers.PropertyInjectedController;
import com.siwoo.springbootudemy.demo.services.PrimaryGermanGreetingService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootudemyApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringbootudemyApplication.class, args);
        ConfigurableApplicationContext c =  SpringApplication.run(SpringbootudemyApplication.class, args);
        MyController myController = c.getBean(MyController.class);
        myController.hello();
        System.out.println(c.getBean(PropertyInjectedController.class).sayHello());

        c.getBean(PrimaryGermanGreetingService.class).sayGreeting();
    }
}
