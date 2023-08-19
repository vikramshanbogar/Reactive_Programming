package com.example.ReactiveClient.config;

import com.example.ReactiveClient.Handler.PersonHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {


    @Bean
    public RouterFunction<ServerResponse> router(PersonHandler personHandler){
        return RouterFunctions.route().GET("/fetchAll",personHandler::fetchAll).build();
    }
}
