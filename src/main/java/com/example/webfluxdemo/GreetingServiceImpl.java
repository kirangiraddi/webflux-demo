package com.example.webfluxdemo;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String displayGreeting() {

        return "Hello World";

    };
}
