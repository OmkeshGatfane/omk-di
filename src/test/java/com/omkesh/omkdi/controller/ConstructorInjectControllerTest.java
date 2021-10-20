package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.GreetingService;
import com.omkesh.omkdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectControllerTest {

    public ConstructorInjectController constructorInjectController;
    @BeforeEach
    void setUp()
    {
        constructorInjectController= new ConstructorInjectController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting()
    {
        System.out.println(constructorInjectController.getGreeting());
    }
}