package com.example.webfluxdemo;


import com.example.webfluxdemo.model.Object;
import com.example.webfluxdemo.model.Object2;
import com.github.wnameless.json.flattener.JsonFlattener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;

import java.util.Map;

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
        //System.out.println(json);
        return json;
    }

    @Override
    public Flux<String> display10uuid() {
        String [] uuids = new String[10];

        for(int i = 0; i< 10; i++){

            String url = "https://httpbin.org/uuid";
            RestTemplate restTemplate = new RestTemplate();
            uuids[i] = restTemplate.getForObject(url, String.class);

        }

        Flux<String> uuidflux = Flux.fromArray(uuids);
        return  uuidflux;
    }

    @Override
    public Map<String, java.lang.Object> flatmapjson() {
        String url = "https://run.mocky.io/v3/bacada99-f016-42e0-ba48-a9b0478f0d8b";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        String flattenedJson = JsonFlattener.flatten(response);
        Map<String, java.lang.Object> flattenedJsonMap = JsonFlattener.flattenAsMap(response);
        return flattenedJsonMap;
    }

    @Override
    public Object2 displaymockyjson() {
        String url = "https://run.mocky.io/v3/bacada99-f016-42e0-ba48-a9b0478f0d8b";
        RestTemplate restTemplate = new RestTemplate();
        Object2 json = restTemplate.getForObject(url, Object2.class);
        return json;
    }


}
