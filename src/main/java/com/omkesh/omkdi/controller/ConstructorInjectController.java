package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectController
{
  private final GreetingService greetingService;

 public ConstructorInjectController(GreetingService greetingService) {
  this.greetingService = greetingService;
 }
 public String getGreeting()
 {
  return greetingService.sayGreeting();
 }
}
