package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.GreetingService;
import com.omkesh.omkdi.service.GreetingServiceImpl;

public class PropertyInjectController
{
    public GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
