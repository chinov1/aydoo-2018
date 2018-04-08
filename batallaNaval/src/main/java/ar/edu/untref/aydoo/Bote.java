package ar.edu.untref.aydoo;

public class Bote extends Barco{
    Posicion lugar;

    public Posicion getPosicion() {
        return lugar;
    }

    public void agregarPosicion(Posicion posicion) {
        lugar = posicion;
    }
}
