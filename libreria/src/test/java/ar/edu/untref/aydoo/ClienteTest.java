package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 11/04/2018.
 */
public class ClienteTest {
    @Test
    public void clienteRealizaCompraSeRegistraCompra(){
        Cliente unCliente = new Cliente();
        Libro principito = new Libro(10);

        Compra unaCompra = unCliente.comprar(principito);

        Assert.assertEquals(unaCompra,unCliente.getCompra());
    }
}
