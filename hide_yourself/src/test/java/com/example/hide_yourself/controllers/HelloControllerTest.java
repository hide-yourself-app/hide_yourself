package com.example.hide_yourself.controllers;

import com.example.hide_yourself.AbstractIT;
import com.example.hide_yourself.codegen.model.HelloWorld;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

class HelloControllerTest extends AbstractIT {
    @Autowired
    WebTestClient webTestClient;

    @Test
    void helloGet() {
        webTestClient.get()
                .uri("/hello")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody(HelloWorld.class)
                .value(HelloWorld::getText, Matchers.equalTo("Hello World"))
                .value(HelloWorld::getCurrentTime, Matchers.notNullValue());
    }
}