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
    }

    public boolean estaDisponible(Posicion posicion) {

        return this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].esAgua();

    }

    public void ponerCruceroVertical(Crucero unCrucero, Posicion posicion) {
        this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].setEsAgua(false);
        /*System.out.println(posicion.getPosicionHorizontal());
        System.out.println(posicion.getPosicionVertical());
        System.out.println(posicion.getPosicionHorizontal()+1);*/
        this.posiciones[posicion.getPosicionHorizontal()+1][posicion.getPosicionVertical()].setEsAgua(false);
    }

    public void ponerCruceroHorizontal(Crucero unCrucero, Posicion posicionIzquierda) {
    }
}
