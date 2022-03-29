package com.example.webfluxdemo;

import com.example.webfluxdemo.model.Object;
import com.example.webfluxdemo.model.Object2;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.Map;

@Component
public interface Services {


    String displayGreeting();

    String displayuuid();

    Object displayhttpjson();

    Flux<String> display10uuid();

    Map<String, java.lang.Object> flatmapjson();

    Object2 displaymockyjson();

}
