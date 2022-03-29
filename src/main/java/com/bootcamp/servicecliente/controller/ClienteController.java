package com.bootcamp.servicecliente.controller;

import com.bootcamp.servicecliente.Entity.Cliente;
import com.bootcamp.servicecliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public Flux<Cliente> findAll(){
        return clienteService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Cliente> findById(@PathVariable String id) {
        return clienteService.findById(id);
    }

    @PostMapping("/new")
    public Mono<Cliente> save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PostMapping("/getClientByDocument")
    public Flux<Cliente> getByDocument(@RequestBody Cliente cliente) {
        return clienteService.getByDocument(cliente);
    }

    @PutMapping
    public Mono<Cliente> put(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return clienteService.deleteById(id);
    }
}
