package com.springframework.HelloWorld.Services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class HelloWorldEnglishImpl  implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Hello WOrld";
    }
}
