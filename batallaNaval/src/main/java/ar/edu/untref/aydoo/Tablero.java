package ar.edu.untref.aydoo;

public class Tablero {
    private Posicion[][] posiciones;

    public Tablero(int ladoTablero) {
        this.posiciones = new Posicion[ladoTablero][ladoTablero];
        for (int i = 1; i < ladoTablero; i++) {
            for (int j = 1; j < ladoTablero; j++) {
                this.posiciones[i][j] = new Posicion(i, j);
            }

        }
    }
/*
    public void ponerBote(Bote unBote, Posicion posicion) {
        if (this.estaDentroDeLimites(posicion, 1)) {
            if (this.posiciones[posicion.getPosicionVertical()][posicion.getPosicionHorizontal()].getEstado() == EstadoDeUnaPosicion.AGUA) {
                this.posiciones[posicion.getPosicionVertical()][posicion.getPosicionHorizontal()].setEstado(EstadoDeUnaPosicion.BARCO);
                this.posiciones[posicion.getPosicionVertical()][posicion.getPosicionHorizontal()].ponerBarco(unBote);
                unBote.agregarPosicion(posicion);
            }
        }
    }*/
public void ponerBote(Bote unBote, Posicion posicion) {
    if (this.estaDentroDeLimites(posicion, unBote.getTamanio())) {
        if (hayAguaHorizontal(posicion,unBote.getTamanio())){
            ponerBarcoHorizontal(unBote,posicion);
            //this.posiciones[posicion.getPosicionVertical()][posicion.getPosicionHorizontal()].setEstado(EstadoDeUnaPosicion.BARCO);
            //this.posiciones[posicion.getPosicionVertical()][posicion.getPosicionHorizontal()].ponerBarco(unBote);
            unBote.agregarPosicion(posicion);
        }
    }
}

    private void ponerBarcoHorizontal(Barco barco, Posicion posicion) {
        for(int i = 0; i<barco.getTamanio();i++){
            this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical() + i].setEstado(EstadoDeUnaPosicion.BARCO);
            this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical() + i].ponerBarco(barco);
        }

    }

    private boolean hayAguaHorizontal(Posicion posicion, int tamanio) {
        boolean salida = true;
        for(int i = 0; i<tamanio;i++){
            if (this.posiciones[posicion.getPosicionVertical()][posicion.getPosicionHorizontal()+i].getEstado() != EstadoDeUnaPosicion.AGUA) {
                salida = false;
            }
        }
        return salida;
    }

    public boolean estaDisponible(Posicion posicion) {
        boolean salida;
        if(this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].getEstado() == EstadoDeUnaPosicion.AGUA){
            salida = true;
        }else{
            salida= false;
        }
        return salida;

    }

    public void ponerCruceroVertical(Crucero unCrucero, Posicion posicion) {
        if (this.estaDentroDeLimites(posicion, 2)) {
            if (this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].getEstado() == EstadoDeUnaPosicion.AGUA && this.posiciones[posicion.getPosicionHorizontal() + 1][posicion.getPosicionVertical()].getEstado() == EstadoDeUnaPosicion.AGUA) {
                this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].setEstado(EstadoDeUnaPosicion.BARCO);
                this.posiciones[posicion.getPosicionHorizontal() + 1][posicion.getPosicionVertical()].setEstado(EstadoDeUnaPosicion.BARCO);
                this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].ponerBarco(unCrucero);
                this.posiciones[posicion.getPosicionHorizontal() + 1][posicion.getPosicionVertical()].ponerBarco(unCrucero);
                unCrucero.agregarPosicion(posicion);
                unCrucero.agregarPosicion(new Posicion(posicion.getPosicionHorizontal() + 1, posicion.getPosicionVertical()));
            }
        }
    }

    public void ponerCruceroHorizontal(Crucero unCrucero, Posicion posicion) {
        if (this.estaDentroDeLimites(posicion, unCrucero.getTamanio())) {
            if (hayAguaHorizontal(posicion,unCrucero.getTamanio())){
                ponerBarcoHorizontal(unCrucero,posicion);
                /*this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].setEstado(EstadoDeUnaPosicion.BARCO);
                this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical() + 1].setEstado(EstadoDeUnaPosicion.BARCO);
                this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].ponerBarco(unCrucero);
                this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical() + 1].ponerBarco(unCrucero);*/
                unCrucero.agregarPosicion(posicion);
                unCrucero.agregarPosicion(new Posicion(posicion.getPosicionHorizontal(), posicion.getPosicionVertical() + 1));
            }
        }
    }


    public EstadoDeUnaPosicion disparar(Posicion posicionDeDisparo) {
        if (this.posiciones[posicionDeDisparo.getPosicionHorizontal()][posicionDeDisparo.getPosicionVertical()].getEstado() == EstadoDeUnaPosicion.AGUA) {
            return EstadoDeUnaPosicion.AGUA;
        } else {
            this.posiciones[posicionDeDisparo.getPosicionHorizontal()][posicionDeDisparo.getPosicionVertical()].setEstado(EstadoDeUnaPosicion.TOCADO);
            this.posiciones[posicionDeDisparo.getPosicionHorizontal()][posicionDeDisparo.getPosicionVertical()].getBarco().tocadoEn(posicionDeDisparo);
            if (this.posiciones[posicionDeDisparo.getPosicionHorizontal()][posicionDeDisparo.getPosicionVertical()].getBarco().estaHundido()) {
                return EstadoDeUnaPosicion.HUNDIDO;
            } else {
                return EstadoDeUnaPosicion.TOCADO;
            }

        }

    }

    public Barco getBarcoEn(Posicion posicion) {
        return this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].getBarco();
    }

    private boolean estaDentroDeLimites(Posicion posicionAProbar, int tamano) {
        if ((posicionAProbar.getPosicionHorizontal() - 1 + tamano) < posiciones.length && (posicionAProbar.getPosicionVertical() - 1 + tamano) < posiciones.length)
            return true;
        else
            return false;

    }

}
