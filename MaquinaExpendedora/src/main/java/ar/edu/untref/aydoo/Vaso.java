package ar.edu.untref.aydoo;

/*public enum contenido{
    cafe;
    azucar;
    te;

}*/

public class Vaso {
    int cantidadDeAzucar;
    boolean azucar = false;
    String contenido = "";

    public int getCantidadDeAzucar() {
        return cantidadDeAzucar;
    }

    public boolean tieneCafe() {
        if (contenido=="cafe"){
            return true;
        }else{
            return false;
        }

    }

    public boolean tieneAzucar() {
        return azucar;
    }

    public boolean tieneTe() {
        if (contenido == "te")
        {   return true;
        }else{
            return false;
        }
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setAzucar(int azucarAgregada) {
        if(azucarAgregada>0) {
            this.cantidadDeAzucar = azucarAgregada;
            this.azucar = true;
        }
    }
}
