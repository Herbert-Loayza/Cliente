package com.bootcamp.servicecliente.controller;

import com.bootcamp.servicecliente.Entity.Persona;
import com.bootcamp.servicecliente.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public Flux<Persona> findAll(){
        return personaService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Persona> findById(@PathVariable String id) {
        return personaService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Persona> save(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @PutMapping
    public Mono<Persona> put(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return personaService.deleteById(id);
    }
}
