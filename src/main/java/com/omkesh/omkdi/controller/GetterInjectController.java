package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.GreetingService;

public class GetterInjectController
{
    GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
