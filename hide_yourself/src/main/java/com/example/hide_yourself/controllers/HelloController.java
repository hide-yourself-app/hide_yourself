package com.example.hide_yourself.controllers;

import com.example.hide_yourself.api.HelloApi;
import com.example.hide_yourself.model.HelloWorld;
import com.example.hide_yourself.services.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HelloController implements HelloApi {
    private final AccountService accountService;

    @Override
    public Mono<ResponseEntity<HelloWorld>> helloGet(ServerWebExchange exchange) {
        return Mono.just(ResponseEntity.ok(HelloWorld.builder()
                        .text("Hello World")
                        .currentTime(OffsetDateTime.now())
                .build()));
    }
}