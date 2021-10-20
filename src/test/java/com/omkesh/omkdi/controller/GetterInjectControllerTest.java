package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetterInjectControllerTest {
    GetterInjectController getterInjectController;

    @BeforeEach
    void setUp()
    {
        getterInjectController= new GetterInjectController();

         getterInjectController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(getterInjectController.getGreeting());
    }
}