package com.bootcamp.servicecliente.repository;

import com.bootcamp.servicecliente.Entity.Persona;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PersonaRepository extends ReactiveMongoRepository<Persona, String> {
}
