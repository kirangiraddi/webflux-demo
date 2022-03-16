package com.example.webfluxdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    private Services service;


    @RequestMapping("/hello")
    public String displayGreetings(){
        return service.displayGreeting();
    }

    @RequestMapping("/uuid")
    public String displayUUID(){
        return service.displayuuid();
    }


}