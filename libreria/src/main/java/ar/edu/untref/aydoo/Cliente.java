package ar.edu.untref.aydoo;

/**
 * Created by nicopaez on 11/04/2018.
 */
public class Cliente {
    private Compra miCompra;

    public Compra comprar(Libro unLibro) {
        this.miCompra = new Compra (unLibro);
        return this.miCompra;
    }

    public Compra getCompra() {
        return this.miCompra;
    }
}
