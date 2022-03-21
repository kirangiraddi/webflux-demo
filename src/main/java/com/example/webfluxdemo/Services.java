package com.example.webfluxdemo;

import com.example.webfluxdemo.model.Object;
import org.springframework.stereotype.Component;

@Component
public interface Services {


    String displayGreeting();

    String displayuuid();

    Object displayhttpjson();
}
