package com.omkesh.omkdi.controller;

import com.omkesh.omkdi.service.GreetingService;

public class ConstructorInjectController
{
  public GreetingService greetingService;

 public ConstructorInjectController(GreetingService greetingService) {
  this.greetingService = greetingService;
 }
 public String getGreeting()
 {
  return greetingService.sayGreeting();
 }
}
