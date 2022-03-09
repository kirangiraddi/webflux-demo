package com.example.webfluxdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldHandler {

    @Autowired
    private GreetingService service;


    @GetMapping("/hello")
    public String displayGreetings(){
        return service.displayGreeting();
    }


}