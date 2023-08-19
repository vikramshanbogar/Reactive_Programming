package com.example.ReactiveClient.Handler;

import com.example.ReactiveClient.Model.Person;
import com.example.ReactiveClient.config.WebClientConfig;
import com.example.ReactiveClient.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class PersonHandler {

    @Autowired
    PersonService personService;

    public Mono<ServerResponse> fetchAll(ServerRequest req){
      return ok().contentType(MediaType.TEXT_EVENT_STREAM).body(personService.fetchAll(),Person.class);
    }
}
