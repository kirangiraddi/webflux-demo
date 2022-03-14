package com.example.webfluxdemo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(HelloWorldHandler.class)
public class TestGreetingController {

    @Autowired
    WebTestClient webTestClient;

    @MockBean
    private GreetingServiceImpl empl;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        webTestClient.get()
                .uri("/hello")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus()
                .isOk();
    }
}