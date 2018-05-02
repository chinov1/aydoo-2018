package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Votacion {
    List<Candidato> candidatos;

    public Votacion(){
        candidatos = new ArrayList<>();
    }

    public void agregarCandidato(Candidato candidatoAgregado) {
        candidatos.add(candidatoAgregado);
    }

    public Candidato getCandidato() {
        return candidatos.get(0);
    }
}
