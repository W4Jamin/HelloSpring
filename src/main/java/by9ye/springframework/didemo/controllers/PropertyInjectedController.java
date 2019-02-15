package by9ye.springframework.didemo.controllers;

import by9ye.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
