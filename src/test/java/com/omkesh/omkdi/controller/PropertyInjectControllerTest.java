package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.ConstructorInjectService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectControllerTest {

    PropertyInjectController controller;
    @BeforeEach
    void setUp()
    {
     controller = new PropertyInjectController();
     controller.greetingService=new ConstructorInjectService();
    }

    @Test
    void getGreeting()
    {
        System.out.println(controller.getGreeting());
    }
}