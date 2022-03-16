package com.example.webfluxdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebFluxTest(ServicesImpl.class)
public class TestServices {


    @Autowired
    ServicesImpl hello;

    @Test
    public void getEmployeeByIdTest()
    {

        assertEquals("Hello World", hello.displayGreeting());

    }
}
