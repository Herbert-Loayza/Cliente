package com.bootcamp.servicecliente.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "cliente")
public class Cliente {

    @Id
    private String id;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    private Integer tipo; // 1 = personal ; 2 = Empresarial

}
