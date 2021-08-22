package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectController
{
    private  GreetingService greetingService;
    @Qualifier("setterInjectService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
