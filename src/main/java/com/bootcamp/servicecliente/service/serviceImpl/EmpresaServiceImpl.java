package com.bootcamp.servicecliente.service.serviceImpl;

import com.bootcamp.servicecliente.Entity.Empresa;
import com.bootcamp.servicecliente.Entity.Persona;
import com.bootcamp.servicecliente.repository.EmpresaRepository;
import com.bootcamp.servicecliente.repository.PersonaRepository;
import com.bootcamp.servicecliente.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class EmpresaServiceImpl implements EmpresaService {

   @Autowired
   private EmpresaRepository empresaRepository;

    @Override
    public Flux<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Mono<Empresa> findById(String id) {
        return empresaRepository.findById(id);
    }

    public Mono<Empresa> save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Mono<Void> deleteById(String id) {
        return empresaRepository.deleteById(id);
    }
}
