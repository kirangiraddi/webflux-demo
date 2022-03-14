package com.example.webfluxdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebFluxTest(GreetingServiceImpl.class)
public class TestGreetingService {


    @Autowired
    GreetingServiceImpl hello;

    @Test
    public void getEmployeeByIdTest()
    {

        assertEquals("Hello World", hello.displayGreeting());

    }
}
