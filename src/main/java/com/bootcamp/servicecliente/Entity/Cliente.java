package com.bootcamp.servicecliente.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Cliente {

    @Id
    private String idCliente;
}
