package com.example.ReactiveProducer.Controller;

import com.example.ReactiveProducer.Model.Person;
import com.example.ReactiveProducer.Repo.PersonRepo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class PersonController {

    PersonController(PersonRepo personRepo){
        this.personRepo = personRepo;
    }
    PersonRepo personRepo;

    @GetMapping(value = "/persons",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Person> get() {
        return personRepo.findAll().delayElements(Duration.ofSeconds(2));
    }
}
