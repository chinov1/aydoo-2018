package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
    public void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
        HacedorDeCafeConLeche cafeLeche = new HacedorDeCafeConLeche();
        cafeLeche.hacer(unVaso);

        Azucarero azucar = new Azucarero();
        azucar.ponerAzucar(unVaso, cantidadAzucar);


    }

    public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
        HacedorDeTeConLeche teLeche = new HacedorDeTeConLeche();
        teLeche.hacer(unVaso);

        Azucarero azucar = new Azucarero();
        azucar.ponerAzucar(unVaso, cantidadAzucar);

        //unVaso.setContenido("te");
        //unVaso.setAzucar(cantidadAzucar);
    }
}
