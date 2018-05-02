package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Votacion {
    private List<Candidato> candidatos;
    private List<Integer> votosEmitidos;

    public Votacion(){
        candidatos = new ArrayList<>();
        votosEmitidos = new ArrayList<>();
    }

    public void agregarCandidato(Candidato candidatoAgregado) {
        candidatos.add(candidatoAgregado);
    }

    public Candidato getCandidato() {
        return candidatos.get(0);
    }

    public void votar(Candidato candidatoVotado, Integer DNI) {
        if(!votosEmitidos.contains(DNI)){
            for (Candidato candidatoIterado:candidatos) {
                if(candidatoIterado == candidatoVotado){
                    candidatoIterado.sumarVoto();
                    votosEmitidos.add(DNI);
                }
            }
        }
    }

    public int cantidadVotos(Candidato candidato) {
        int votos = 0;
        for (Candidato candidatoIterado:candidatos) {
            if(candidatoIterado == candidato){
                votos = candidato.getVotos();
            }
        }
        return votos;
    }
}
