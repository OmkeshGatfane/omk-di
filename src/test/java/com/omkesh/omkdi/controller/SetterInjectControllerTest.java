package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.ConstructorInjectService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectControllerTest {
    SetterInjectController setterInjectController;

    @BeforeEach
    void setUp()
    {
        setterInjectController = new SetterInjectController();

         setterInjectController.setGreetingService(new ConstructorInjectService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectController.getGreeting());
    }
}