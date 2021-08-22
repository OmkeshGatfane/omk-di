package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.ConstructorInjectService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectControllerTest {

    public ConstructorInjectController constructorInjectController;
    @BeforeEach
    void setUp()
    {
        constructorInjectController= new ConstructorInjectController(new ConstructorInjectService());
    }

    @Test
    void getGreeting()
    {
        System.out.println(constructorInjectController.getGreeting());
    }
}