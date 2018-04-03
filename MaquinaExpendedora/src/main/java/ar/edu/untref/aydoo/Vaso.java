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
    public String getContenido(){
        return contenido;
    };

    public int getCantidadDeAzucar() {
        return cantidadDeAzucar;
    }

    public boolean tieneCafe() {
        if (contenido.equals("cafe") || contenido.equals("cafeConLeche")){
            return true;
        }else{
            return false;
        }

    }

    public boolean tieneAzucar() {
        return azucar;
    }

    public boolean tieneTe() {
        if (contenido.equals("te") || contenido.equals("teConLeche"))
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
