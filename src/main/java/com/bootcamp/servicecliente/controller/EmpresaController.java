package com.bootcamp.servicecliente.controller;

import com.bootcamp.servicecliente.Entity.Empresa;
import com.bootcamp.servicecliente.Entity.Persona;
import com.bootcamp.servicecliente.service.EmpresaService;
import com.bootcamp.servicecliente.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public Flux<Empresa> findAll(){
        return empresaService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Empresa> findById(@PathVariable String id) {
        return empresaService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Empresa> save(@RequestBody Empresa empresa) {
        return empresaService.save(empresa);
    }

    @PutMapping("/{id}")
    public Mono<Empresa> put(@RequestBody Empresa empresa) {
        return empresaService.save(empresa);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return empresaService.deleteById(id);
    }
}
