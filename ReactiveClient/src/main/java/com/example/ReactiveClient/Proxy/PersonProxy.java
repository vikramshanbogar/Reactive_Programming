package com.example.ReactiveClient.Proxy;

import com.example.ReactiveClient.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
public class PersonProxy {

    @Autowired
    WebClient webClient;

    public Flux<Person> fetchAll(){
        return webClient.get().uri("/persons").exchangeToFlux(res->res.bodyToFlux(Person.class));
    }

}
