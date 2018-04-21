package ar.edu.untref.aydoo;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by nicopaez on 11/04/2018.
 */
public class Libreria {

    Collection<Cliente>clientes;


    public Libreria(){
        clientes = new ArrayList<>();
    }

    public int calcularMontoDelMes(Cliente miCliente) {


        return miCliente.calcularMontoDelMes();
    }

    public void agregarCliente(Cliente miCliente) {
        clientes.add(miCliente);
    }

    public boolean tieneCliente(Cliente miCliente) {
        return clientes.contains(miCliente);
    }
    /*
    public Cliente obtenerCliente(Cliente miCliente) {
        Cliente clienteAdevolver;

        for(Iterator<Cliente> iterator = clientes.listIterator(); iterator.hasNext();){
            if(clientes.get(iterator) == miCliente){
                clienteAdevolver  =clientes.get(iterator);
            }

        }

        return clientes.contains(miCliente);
    }*/
}