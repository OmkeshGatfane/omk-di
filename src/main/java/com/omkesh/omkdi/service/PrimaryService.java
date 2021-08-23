package com.omkesh.omkdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hi from primary bean";
    }
}
