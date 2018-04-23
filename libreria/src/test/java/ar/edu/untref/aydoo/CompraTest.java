package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CompraTest {
    @Test
    public void obtenerValorCompra(){

        Cliente miCliente = new Cliente();

        Libro principito = new Libro(10);

        Compra compra = miCliente.comprar(principito);

        Assert.assertEquals(10, compra.valorCompra());
    }

    @Test
    public void compraTieneUnaFecha(){

        Cliente miCliente = new Cliente();
        Libro principito = new Libro(10);
        Compra compra = miCliente.comprar(principito);

        compra.setFecha(19,11,1990);


        Assert.assertEquals(19,compra.getDia());
        Assert.assertEquals(11,compra.getMes());
        Assert.assertEquals(1990,compra.getAnio());
    }
}
