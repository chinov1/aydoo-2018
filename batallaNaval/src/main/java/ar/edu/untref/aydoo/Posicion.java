package ar.edu.untref.aydoo;

public class Posicion {

    private int posicionVertical;
    private int posicionHorizontal;
    private Barco elBarcoQueTieneLaPosicion;
    private boolean esAgua;
    protected Disparo estado;


    public Posicion(int posicionHorizontal, int posicionVertical) {
        this.posicionHorizontal = posicionHorizontal;
        this.posicionVertical = posicionVertical;
        this.esAgua = true;
        this.estado = Disparo.AGUA;
    }

    public boolean esAgua() {
        return this.esAgua;
    }

    public int getPosicionVertical() {
        return posicionVertical;
    }

    public int getPosicionHorizontal() {
        return posicionHorizontal;
    }

    public void setEsAgua(boolean esAgua) {
        this.esAgua = esAgua;
    }

    public void setPosicion(int j, int i) {
        this.setPosicionHorizontal(j);
        this.setPosicionVertical(i);
    }

    public void setPosicionHorizontal(int posicionHorizontal) {
        this.posicionHorizontal = posicionHorizontal;
    }

    public void setPosicionVertical(int posicionVertical) {
        this.posicionVertical = posicionVertical;
    }

    public boolean esIgualA(Posicion posicionAComparar) {
        if (this.getPosicionVertical() == posicionAComparar.getPosicionVertical() && this.getPosicionHorizontal() == posicionAComparar.getPosicionHorizontal()){
            return true;
        }else{
            return false;
        }
    }

    public void ponerBarco(Barco barquito) {
        this.elBarcoQueTieneLaPosicion = barquito;
    }

    public void setEstado(Disparo estado) {
        this.estado = estado;
    }

    public Barco getBarco() {
        return elBarcoQueTieneLaPosicion;
    }

    public Disparo getEstado() {
        return estado;
    }

    public void tocado() {
        this.estado = Disparo.TOCADO;
    }
}
