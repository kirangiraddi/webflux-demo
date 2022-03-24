package com.example.webfluxdemo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(Controller.class)
public class TestJSONController {

    @Autowired
    WebTestClient webTestClient;

    @MockBean
    private ServicesImpl serv;

    @Test
    public void checkController()  {
        webTestClient.get()
                .uri("/json")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus()
                .isOk();
    }
}
