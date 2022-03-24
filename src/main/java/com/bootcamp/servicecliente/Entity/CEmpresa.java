package com.bootcamp.servicecliente.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "empresa")
public class CEmpresa {

    @Id
    private String id;
}
