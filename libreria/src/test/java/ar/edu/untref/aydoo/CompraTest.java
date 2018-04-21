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
}
