package com.siwoo.springbootudemy.demo.controllers;

import com.siwoo.springbootudemy.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */

public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
