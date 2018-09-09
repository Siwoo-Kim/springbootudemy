package com.siwoo.springbootudemy.demo.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */
@Repository
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio";
    }

    @Override
    public String getGermanGreeting() {
        return "Primarer";
    }
}
