package ar.edu.untref.aydoo;

import java.util.List;
import java.util.ListIterator;

public class Barco {
    protected List<Posicion> posiciones;

    public List<Posicion> getListaDePosiciones() {
        return posiciones;
    }
    public boolean estaEn(Posicion posicionComparada) {
        List<Posicion> posiciones = this.getListaDePosiciones();
        Posicion posicionDelCrucero;
        boolean salida = false;
        for(ListIterator<Posicion> iterador = posiciones.listIterator(); iterador.hasNext();){
            posicionDelCrucero = iterador.next();
            if(posicionDelCrucero.esIgualA(posicionComparada)){
                salida = true;
            }
        }
        return salida;
    }

}
