package ar.edu.untref.aydoo;

public class Candidato {
    private final String nombre;
    private final PROVINCIA provincia;
    private final PARTIDO partido;

    public Candidato(String nombre, PARTIDO partido, PROVINCIA prov) {
        this.nombre = nombre;
        this.partido = partido;
        this.provincia = prov;
    }
}
