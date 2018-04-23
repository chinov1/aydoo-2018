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
        Assert.assertEquals(0,miCliente.calcularComprasDelMes());

    }

    @Test
    public void clienteCompraUnProductoDeValor10(){

        Cliente miCliente = new Cliente();
        Libro principito = new Libro(10);

        miCliente.comprar(principito);

        Assert.assertEquals(10, miCliente.calcularComprasDelMes());
    }
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

        Assert.assertEquals(20, miCliente.calcularComprasDelMes());
    }
    @Test
    public void comproEnDosMesesDistintosYcalculoMes(){
        Cliente miCliente = new Cliente();
        Libro principito = new Libro(10);
        Libro hobbit = new Libro(15);

        miCliente.comprar(principito);
        Compra segundaCompraQueLeCambioLaFecha = miCliente.comprar(hobbit);

        segundaCompraQueLeCambioLaFecha.setFecha(19,11,1990);

        Assert.assertEquals(15, miCliente.calcularComprasDelMes(11,1990));
    }
    @Test
    public void comproEntresMesesDistintosYcalculoAnioMes(){
        Cliente miCliente = new Cliente();
        Libro principito = new Libro(10);
        Libro hobbit = new Libro(15);
        Libro songOfIceAndFire = new Libro(20);

        Compra primeraCompra = miCliente.comprar(principito);
        primeraCompra.setFecha(19,01,2018);
        Compra segundaCompra = miCliente.comprar(hobbit);
        segundaCompra.setFecha(19,02,2018);
        Compra terceraCompra = miCliente.comprar(songOfIceAndFire);
        segundaCompra.setFecha(19,07,2018);

        Assert.assertEquals(45, miCliente.calcularComprasDelAnio());
    }


}
