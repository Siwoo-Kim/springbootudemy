package com.siwoo.springbootudemy.demo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */

@Controller
public class MyController {

    public String hello() {
        String value = "Hello Spring";
        System.out.println("Hello Spring");
        return value;
    }
}
