package com.example.webfluxdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;


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

    @RequestMapping("/json")
    public Object displayhttpjson(){
        return service.displayhttpjson();
    }

    @RequestMapping("/uuidflux")
    public Flux<String> displayUUIDflux(){ return service.display10uuid(); }


    @GetMapping(value = "/uuidstream")
    public Flux<String> streamDataFlux()  {

        Flux<String> flux = service.display10uuid();
        return Flux
                .from(flux)
                .delayElements(Duration.ofSeconds(1))
                .log();
    }

    @GetMapping(value = "/flatjson")
    public String displayflatjson(){
        String flat = service.flatmapjson().toString();
         flat=flat.replaceAll(",", "<br>");
        return flat;
    }

    @RequestMapping("/mocky")
    public Object displaymockyjson(){
        return service.displaymockyjson();
    }


}