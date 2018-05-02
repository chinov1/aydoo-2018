package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class VotacionTest {


    @Test
    public void creoVotacionConUnCandidato() {
        Candidato pepe = new Candidato("Pepe",PARTIDO.PO,PROVINCIA.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);

        Assert.assertEquals(pepe,pasoProvincial.getCandidato());
    }

    /*
    @Test
    public void obtengoCandidatoMasVotadoEnUnaProvincia() {
        Candidato pepe = new Candidato("Pepe",PARTIDO.PO,PROVINCIA.BUENOSAIRES);
        Candidato juan = new Candidato("juan",PARTIDO.PRO,PROVINCIA.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);
        pasoProvincial.agregarCandidato(juan);

        pasoProvincial.agregarCandidato(pepe);
        pasoProvincial.agregarCandidato(juan);

        pasoProvincial.votar(pepe,35605771);
        pasoProvincial.votar(pepe,37345503);
        pasoProvincial.votar(juan,13664773);

        Candidato candidatoMasVotado = pasoProvincial.ganadorDe(PROVINCIA.BUENOSAIRES);

        Assert.assertEquals(pepe,candidatoMasVotado);
    }*/

    @Test
    public void creoUnaVotacionCon0Votos() {
        Candidato pepe = new Candidato("Pepe",PARTIDO.PO,PROVINCIA.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();

        pasoProvincial.agregarCandidato(pepe);

        Assert.assertEquals(0,pasoProvincial.cantidadVotos(pepe));
    }
    @Test
    public void obtengoVotosDeUnCandidato() {
        Candidato pepe = new Candidato("Pepe",PARTIDO.PO,PROVINCIA.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);

        pasoProvincial.votar(pepe,35605771);

        Assert.assertEquals(1,pasoProvincial.cantidadVotos(pepe));
    }

    @Test
    public void unaPersonaQuiereVotar2Veces() {
        Candidato pepe = new Candidato("Pepe",PARTIDO.PO,PROVINCIA.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);

        pasoProvincial.votar(pepe,35605771);
        pasoProvincial.votar(pepe,35605771);

        Assert.assertEquals(1,pasoProvincial.cantidadVotos(pepe));
    }
    @Test
    public void cuentoVotosDe2candidatos() {
        Candidato pepe = new Candidato("Pepe",PARTIDO.PO,PROVINCIA.BUENOSAIRES);
        Candidato juan = new Candidato("juan",PARTIDO.PRO,PROVINCIA.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);
        pasoProvincial.agregarCandidato(juan);

        pasoProvincial.votar(pepe,35605771);
        pasoProvincial.votar(pepe,37345503);
        pasoProvincial.votar(juan,13664773);

        Assert.assertEquals(2,pasoProvincial.cantidadVotos(pepe));
        Assert.assertEquals(1,pasoProvincial.cantidadVotos(juan));
    }

}
