package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicopaez on 11/04/2018.
 */
public class Libreria {

    List<Cliente> clientes;

    public Libreria(){
        clientes = new ArrayList<>();
    }

    public int calcularMontoDelMes(Cliente miCliente) {
        return 0;
    }

    public void agregarCliente(Cliente miCliente) {
        clientes.add(miCliente);
    }

    public boolean tieneCliente(Cliente miCliente) {
        return clientes.contains(miCliente);
    }
}