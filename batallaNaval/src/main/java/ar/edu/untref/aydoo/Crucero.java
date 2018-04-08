package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Crucero extends Barco{


    public Crucero(){
        this.posiciones = new ArrayList<Posicion>();
    }

    public void agregarPosicion(Posicion posicion) {
        this.posiciones.add(posicion);
    }
}
