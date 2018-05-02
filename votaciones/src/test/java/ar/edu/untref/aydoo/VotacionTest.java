package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class VotacionTest {


    @Test
    public void creoVotacionConUnCandidato() {
        Candidato pepe = new Candidato("Pepe",PARTIDO.PO,PROVINCIA.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);

        Assert.assertEquals(pepe,pasoProvincial.getCandidato());
    }

}
