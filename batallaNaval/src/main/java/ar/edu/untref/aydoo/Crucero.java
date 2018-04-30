package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Crucero extends Barco {


    public Crucero() {
        this.posiciones = new ArrayList<Posicion>();
    }

    public void agregarPosicion(Posicion posicion) {
        this.posiciones.add(posicion);
    }
}
