package com.bootcamp.servicecliente.service;

import com.bootcamp.servicecliente.Entity.Empresa;
import com.bootcamp.servicecliente.Entity.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmpresaService {

    public Flux<Empresa>findAll();
    public Mono<Empresa> findById(String id);
    public Mono<Empresa>save(Empresa empresa);
    public Mono<Void> deleteById(String id);
}
