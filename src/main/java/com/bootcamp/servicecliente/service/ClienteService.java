package com.bootcamp.servicecliente.service;

import com.bootcamp.servicecliente.Entity.Cliente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClienteService {

    public Flux<Cliente>findAll();
    public Mono<Cliente> findById(String id);
    public Mono<Cliente>save(Cliente cliente);
    public Mono<Void> deleteById(String id);
}
