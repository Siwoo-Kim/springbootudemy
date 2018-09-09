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
@Profile({"ko", "default"})
@Primary
public class KoreanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "안녕 스프링부트!";
    }
}
