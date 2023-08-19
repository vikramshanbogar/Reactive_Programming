package com.example.ReactiveClient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("base.url.path")
    private String baseURL;

    @Bean
    public WebClient webClient(){
        return WebClient.builder().baseUrl("http://localhost:8080").build();
    }

}
