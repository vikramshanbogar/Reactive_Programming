package com.example.ReactiveProducer.Repo;

import com.example.ReactiveProducer.Model.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PersonRepo extends ReactiveCrudRepository<Person, Integer> {
}
