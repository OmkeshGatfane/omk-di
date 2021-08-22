package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.GreetingService;
import com.omkesh.omkdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectControllerTest {

    PropertyInjectController controller;
    @BeforeEach
    void setUp()
    {
     controller = new PropertyInjectController();
     controller.greetingService=new GreetingServiceImpl();
    }

    @Test
    void getGreeting()
    {
        System.out.println(controller.getGreeting());
    }
}