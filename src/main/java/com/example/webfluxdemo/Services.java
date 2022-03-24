package com.example.webfluxdemo;

import com.example.webfluxdemo.model.Object;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public interface Services {


    String displayGreeting();

    String displayuuid();

    Object displayhttpjson();

    Flux<String> display10uuid();

}
