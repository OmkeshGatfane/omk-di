package com.omkesh.omkdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectService implements GreetingService{
    @Override
    public String sayGreeting()
    {
        return "Hello Nagpur---Property";
    }
}
