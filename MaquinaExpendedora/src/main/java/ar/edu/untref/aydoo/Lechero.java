package ar.edu.untref.aydoo;

public class Lechero {

    public void poner(Vaso unVaso) {
        String contenidoActual = unVaso.getContenido();
        unVaso.setContenido(contenidoActual.concat("ConLeche"));

    }
}
