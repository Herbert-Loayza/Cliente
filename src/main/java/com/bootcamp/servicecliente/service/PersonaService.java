package com.bootcamp.servicecliente.service;

import com.bootcamp.servicecliente.Entity.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonaService {

    public Flux<Persona>findAll();
    public Mono<Persona> findById(String id);
    public Mono<Persona>save(Persona persona);
    public Mono<Void> deleteById(String id);
}
