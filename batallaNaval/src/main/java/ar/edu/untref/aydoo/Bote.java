package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Bote extends Barco {

    public Bote() {
        this.posiciones = new ArrayList<Posicion>();
    }

    public Posicion getPosicion() {
        return this.posiciones.get(0);
    }

    public void agregarPosicion(Posicion posicion) {
        this.posiciones.add(posicion);
    }
}
