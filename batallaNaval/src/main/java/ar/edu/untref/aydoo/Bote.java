package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Bote extends Barco {

    public Bote() {
        super();
    }

    public Posicion getPosicion() {
        return this.posiciones.get(0);
    }

    public void agregarPosicion(Posicion posicion) {
        if(posiciones.isEmpty()) {
            this.posiciones.add(posicion);
        }
    }
}
