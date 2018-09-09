package com.siwoo.springbootudemy.demo.services;

import org.springframework.stereotype.Service;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */
public class SecondaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Secondary";
    }
}
