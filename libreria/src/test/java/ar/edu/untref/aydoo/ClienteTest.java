package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 11/04/2018.
 */
public class ClienteTest {

    @Test

    public void calcularMontoDelMesSinNingunaCompra() {

        Cliente miCliente = new Cliente();
        Assert.assertEquals(0,miCliente.calcularMontoDelMes());

    }

    @Test
    public void clienteCompraUnProductoDeValor10(){

        Cliente miCliente = new Cliente();
        Libro principito = new Libro(10);

        miCliente.comprar(principito);

        Assert.assertEquals(10, miCliente.calcularMontoDelMes());
    }
    /*@Test
    public void puedoAgregarUnClienteALaLibreria(){

        Cliente miCliente = new Cliente();

        libreria.agregarCliente(miCliente);

        Assert.assertTrue(libreria.tieneCliente(miCliente));
    }*/

    @Test
    public void clienteRealizaCompraSeRegistraCompra(){
        Cliente unCliente = new Cliente();
        Libro principito = new Libro(10);

        Compra unaCompra = unCliente.comprar(principito);

        Assert.assertEquals(unaCompra,unCliente.getCompra());
    }

    @Test
    public void clienteCompraDosProductos(){
        Cliente miCliente = new Cliente();
        Libro principito = new Libro(10);
        Libro hobbit = new Libro(10);

        miCliente.comprar(principito);
        miCliente.comprar(hobbit);

        Assert.assertEquals(20, miCliente.calcularMontoDelMes());
    }

    public void comproEnDosMesesDistintosYcalculoMes(){
        Cliente miCliente = new Cliente();
        Libro principito = new Libro(10);
        Libro hobbit = new Libro(10);

        miCliente.comprar(principito);
        Compra segundaCompraQueLeCambioLaFecha = miCliente.comprar(hobbit);

        segundaCompraQueLeCambioLaFecha.setFecha(19,11,1990);

        Assert.assertEquals(20, miCliente.calcularMontoDelMes(11,1990));
    }

}
