package ar.edu.untref.aydoo;

/**
 * Created by nicopaez on 11/04/2018.
 */
public class Compra {

    private Libro miLibro;

    public Compra(Libro unLibro) {
        this.miLibro = unLibro;
    }

    public int valorCompra() {
        return this.miLibro.getPrecio();
    }
}
