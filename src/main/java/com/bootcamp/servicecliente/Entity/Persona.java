package com.bootcamp.servicecliente.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "persona")
public class Persona {

    @Id
    private String id;
}
