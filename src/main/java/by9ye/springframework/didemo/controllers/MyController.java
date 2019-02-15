package by9ye.springframework.didemo.controllers;

import by9ye.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("hello!!");
        return greetingService.sayGreeting();
    }
}
