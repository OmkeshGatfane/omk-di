package com.omkesh.omkdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectService implements GreetingService {
    @Override
    public String sayGreeting()
    {
        return "Hello Nagpur---Constructor";
    }
}
