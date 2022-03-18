package com.bootcamp.servicecliente.repository;

import com.bootcamp.servicecliente.Entity.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, String> {
}
