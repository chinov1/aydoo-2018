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

    public void ponerBote(Bote unBote, Posicion posicion) {
        this.posiciones[posicion.getPosicionVertical()][posicion.getPosicionHorizontal()].setEsAgua(false);
        this.posiciones[posicion.getPosicionVertical()][posicion.getPosicionHorizontal()].ponerBarco(unBote);
        unBote.agregarPosicion(posicion);
    }

    public boolean estaDisponible(Posicion posicion) {

        return this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].esAgua();

    }

    public void ponerCruceroVertical(Crucero unCrucero, Posicion posicion) {
        this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].setEsAgua(false);
        this.posiciones[posicion.getPosicionHorizontal()+1][posicion.getPosicionVertical()].setEsAgua(false);
        this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].ponerBarco(unCrucero);
        this.posiciones[posicion.getPosicionHorizontal()+1][posicion.getPosicionVertical()].ponerBarco(unCrucero);
        unCrucero.agregarPosicion(posicion);
        unCrucero.agregarPosicion(new Posicion(posicion.getPosicionHorizontal()+1,posicion.getPosicionVertical()));
    }

    public void ponerCruceroHorizontal(Crucero unCrucero, Posicion posicion) {
        this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].setEsAgua(false);
        this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()+1].setEsAgua(false);
        this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].ponerBarco(unCrucero);
        this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()+1].ponerBarco(unCrucero);
        unCrucero.agregarPosicion(posicion);
        unCrucero.agregarPosicion(new Posicion(posicion.getPosicionHorizontal(),posicion.getPosicionVertical()+1));
    }


    public Disparo disparar(Posicion posicionDeDisparo) {
        if(this.posiciones[posicionDeDisparo.getPosicionHorizontal()][posicionDeDisparo.getPosicionVertical()].esAgua()){
            return Disparo.AGUA;
        }else{
            this.posiciones[posicionDeDisparo.getPosicionHorizontal()][posicionDeDisparo.getPosicionVertical()].setEstado(Disparo.TOCADO);
            this.posiciones[posicionDeDisparo.getPosicionHorizontal()][posicionDeDisparo.getPosicionVertical()].getBarco().tocadoEn(posicionDeDisparo);
            if(this.posiciones[posicionDeDisparo.getPosicionHorizontal()][posicionDeDisparo.getPosicionVertical()].getBarco().estaHundido()){
                return Disparo.HUNDIDO;
            }else {
                return Disparo.TOCADO;
            }

        }

    }
}
