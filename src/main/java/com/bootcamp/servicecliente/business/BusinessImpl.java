package com.bootcamp.servicecliente.business;

import com.bootcamp.servicecliente.Entity.Cliente;
import com.bootcamp.servicecliente.clients.Producto;
import com.bootcamp.servicecliente.util.Constantes;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class BusinessImpl implements IBusiness{


    @Override
    public Mono<Cliente> save(Cliente cliente) {

        List productos = new ArrayList<Producto>();
        Producto p1 = new Producto();
        p1.setId(1);
        p1.setNombres("CC");
        productos.add(p1);



        //validar el tipo
        if(cliente.getTipo().equals(Constantes.TIPO_PERSONAL)){ //P
            //Validar Productos personal (return boolean)
            if(this.validarProductosPersonal(cliente, productos.stream())){  //true

            }
        }else{ //E
            //Validar Productos Emp
            if(this.validarProductosEmpresariales(cliente, productos.stream())){

            }
        }


        return null;
    }

    private boolean validarProductosEmpresariales(Cliente cliente,  Stream<Producto> productos) {

        //  traer del api Producto por Tipo y Num Doc = (List Prod)
        // Lista filtrar (filter por tipo de producto (CA o PF)
        //findAny == no cumple el filtro = (true)
        // // si no, return false

        return true;

    }

    private boolean validarProductosPersonal(Cliente cliente, Stream<Producto> productos) {

        return productos
                .filter(producto ->
                        producto.getTipo().equals(Constantes.TIPO_PRODUCTO_PASIVO))
                .findAny()
                .isEmpty();
    }
}
