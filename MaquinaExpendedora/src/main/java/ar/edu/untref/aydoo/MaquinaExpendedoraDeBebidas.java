package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
    public void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
        unVaso.setContenido("cafe");
        unVaso.setAzucar(cantidadAzucar);
    }

    public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
        unVaso.setContenido("te");
        unVaso.setAzucar(cantidadAzucar);
    }
}
