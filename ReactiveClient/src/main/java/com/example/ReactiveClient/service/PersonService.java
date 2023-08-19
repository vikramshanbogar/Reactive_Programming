package com.example.ReactiveClient.service;

import com.example.ReactiveClient.Model.Person;
import com.example.ReactiveClient.Proxy.PersonProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PersonService {
    @Autowired
    PersonProxy personProxy;

    public Flux<Person> fetchAll() {
       return personProxy.fetchAll();
    }
}
