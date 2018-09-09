package com.siwoo.springbootudemy.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */

@Service
@Profile("en")
@Primary
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_SPRING = "Hello Spring Boot!";

    @Override
    public String sayGreeting() {
        return HELLO_SPRING;
    }
}
