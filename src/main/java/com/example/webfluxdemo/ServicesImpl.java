package com.example.webfluxdemo;


import com.example.webfluxdemo.model.Object;
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

    @Override
    public Object displayhttpjson() {
        String url = "https://httpbin.org/json";
        RestTemplate restTemplate = new RestTemplate();
        Object json = restTemplate.getForObject(url, Object.class);
        System.out.println(json);
        return json;
    }


}
