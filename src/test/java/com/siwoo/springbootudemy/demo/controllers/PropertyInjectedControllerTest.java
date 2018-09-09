package com.siwoo.springbootudemy.demo.controllers;

import com.siwoo.springbootudemy.demo.controllers.PropertyInjectedController;
import com.siwoo.springbootudemy.demo.controllers.SetterInjectedController;
import com.siwoo.springbootudemy.demo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */

public class PropertyInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setup() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_SPRING, setterInjectedController.sayHello());
    }
}
