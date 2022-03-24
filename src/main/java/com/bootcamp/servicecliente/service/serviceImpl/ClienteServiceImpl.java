package com.bootcamp.servicecliente.service.serviceImpl;

import com.bootcamp.servicecliente.Entity.Cliente;
import com.bootcamp.servicecliente.repository.ClienteRepository;
import com.bootcamp.servicecliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ClienteServiceImpl implements ClienteService {

   @Autowired
   private ClienteRepository clienteRepository;

    @Override
    public Flux<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Mono<Cliente> findById(String id) {
        return clienteRepository.findById(id);
    }

    public Mono<Cliente> save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Mono<Void> deleteById(String id) {
        return clienteRepository.deleteById(id);
    }
}
