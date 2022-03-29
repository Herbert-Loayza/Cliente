package com.bootcamp.servicecliente.repository;

import com.bootcamp.servicecliente.Entity.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.util.List;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, String> {

    public Flux<Cliente> findByTipoDocumentoAndNumeroDocumento(String tipoDoc, String numDoc);

}
