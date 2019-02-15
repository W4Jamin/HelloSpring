package by9ye.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class setterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
