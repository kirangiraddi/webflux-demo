package com.example.webfluxdemo;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicesImpl implements Services {

    @Override
    public String displayGreeting() {

        return "Hello World";

    }

    @Override
    public String displayuuid() {
        String url = "https://httpbin.org/uuid";
        RestTemplate restTemplate = new RestTemplate();
        String uuid = restTemplate.getForObject(url, String.class);
        return uuid;
    }

    ;
}
