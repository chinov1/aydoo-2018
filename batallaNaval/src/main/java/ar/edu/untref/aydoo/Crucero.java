package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Crucero {
    private List<Posicion> posiciones;

    public Crucero(){
        this.posiciones = new ArrayList<Posicion>();
    }

    public List<Posicion> getPosicion() {
        return posiciones;
    }

    public void agregarPosicion(Posicion posicion) {
        this.posiciones.add(posicion);
    }

    public boolean estaEn(Posicion posicionComparada) {
        List<Posicion> posiciones = this.getPosicion();
        Posicion posicionDelCrucero;
        int contador = 0;
        boolean salida = false;
        for(ListIterator<Posicion> iterador = posiciones.listIterator(); iterador.hasNext();){
            System.out.println(contador);
            contador++;
            posicionDelCrucero = iterador.next();
            if(posicionDelCrucero.esIgualA(posicionComparada)){
             salida = true;
            }
        }
        System.out.println(salida);
        return salida;
    }
}
