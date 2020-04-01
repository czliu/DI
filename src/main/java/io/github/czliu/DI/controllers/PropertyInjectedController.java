package io.github.czliu.DI.controllers;

import io.github.czliu.DI.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
