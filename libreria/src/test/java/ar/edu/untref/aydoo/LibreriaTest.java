package ar.edu.untref.aydoo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;


public class LibreriaTest {


    @Test

    public void calcularMontoDelMesSinNingunaCompra() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente();
        Assert.assertEquals(0,libreria.calcularMontoDelMes(miCliente));

    }

    @Ignore
    public void clienteCompraUnProductoDeValor10(){
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente();
        Libro principito = new Libro(10);

        miCliente.comprar(principito);

        Assert.assertEquals(10, libreria.calcularMontoDelMes(miCliente));
    }

}
