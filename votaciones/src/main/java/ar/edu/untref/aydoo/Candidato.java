package ar.edu.untref.aydoo;

public class Candidato {
    private final String nombre;
    private final PROVINCIA provincia;
    private final PARTIDO partido;
    private int votos;

    public Candidato(String nombre, PARTIDO partido, PROVINCIA prov) {
        this.nombre = nombre;
        this.partido = partido;
        this.provincia = prov;
        votos = 0;
    }

    public void sumarVoto() {
        votos++;
    }

    public int getVotos() {
        return votos;
    }

    public String getNombre() {
        return nombre;
    }
}
