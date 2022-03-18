package com.bootcamp.servicecliente.service.serviceImpl;

import com.bootcamp.servicecliente.Entity.Persona;
import com.bootcamp.servicecliente.repository.PersonaRepository;
import com.bootcamp.servicecliente.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class PersonaServiceImpl implements PersonaService {

   @Autowired
   private PersonaRepository personaRepository;

    @Override
    public Flux<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Mono<Persona> findById(String id) {
        return personaRepository.findById(id);
    }

    public Mono<Persona> save(Persona persona) {
        return personaRepository.save(persona);
    }

    public Mono<Void> deleteById(String id) {
        return personaRepository.deleteById(id);
    }
}
