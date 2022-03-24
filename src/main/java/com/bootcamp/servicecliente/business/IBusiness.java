package com.bootcamp.servicecliente.business;

import com.bootcamp.servicecliente.Entity.Cliente;
import reactor.core.publisher.Mono;

public interface IBusiness {

    public Mono<Cliente> save(Cliente cliente );
}
