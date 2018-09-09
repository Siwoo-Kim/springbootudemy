package com.siwoo.springbootudemy.demo.controllers;

import com.siwoo.springbootudemy.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */

@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
