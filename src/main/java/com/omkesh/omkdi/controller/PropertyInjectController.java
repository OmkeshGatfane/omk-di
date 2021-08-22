package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.GreetingService;
import com.omkesh.omkdi.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectController
{
    @Autowired
     public GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
