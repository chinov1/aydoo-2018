package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class VotacionTest {


    @Test
    public void creoVotacionConUnCandidato() {
        Candidato pepe = new Candidato("Pepe", Partido.PO, Provincia.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);

        Assert.assertEquals(pepe,pasoProvincial.getCandidato());
    }


    @Test
    public void obtengoCandidatoMasVotadoEnUnaProvincia() {
        Candidato pepe = new Candidato("Pepe", Partido.PO, Provincia.BUENOSAIRES);
        Candidato juan = new Candidato("juan", Partido.PRO, Provincia.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);
        pasoProvincial.agregarCandidato(juan);

        pasoProvincial.agregarCandidato(pepe);
        pasoProvincial.agregarCandidato(juan);

        pasoProvincial.votar(pepe,35605771);
        pasoProvincial.votar(pepe,37345503);
        pasoProvincial.votar(juan,13664773);

        Candidato candidatoMasVotado = pasoProvincial.ganadorDe(Provincia.BUENOSAIRES);

        Assert.assertEquals(pepe,candidatoMasVotado);
    }

    @Test
    public void creoUnaVotacionCon0Votos() {
        Candidato pepe = new Candidato("Pepe", Partido.PO, Provincia.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();

        pasoProvincial.agregarCandidato(pepe);

        Assert.assertEquals(0,pepe.getVotos());
    }
    @Test
    public void obtengoVotosDeUnCandidato() {
        Candidato pepe = new Candidato("Pepe", Partido.PO, Provincia.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);

        pasoProvincial.votar(pepe,35605771);

        Assert.assertEquals(1,pepe.getVotos());
    }

    @Test
    public void unaPersonaQuiereVotar2Veces() {
        Candidato pepe = new Candidato("Pepe", Partido.PO, Provincia.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);

        pasoProvincial.votar(pepe,35605771);
        pasoProvincial.votar(pepe,35605771);

        Assert.assertEquals(1,pepe.getVotos());
    }
    @Test
    public void cuentoVotosDe2candidatos() {
        Candidato pepe = new Candidato("Pepe", Partido.PO, Provincia.BUENOSAIRES);
        Candidato juan = new Candidato("juan", Partido.PRO, Provincia.BUENOSAIRES);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);
        pasoProvincial.agregarCandidato(juan);

        pasoProvincial.votar(pepe,35605771);
        pasoProvincial.votar(pepe,37345503);
        pasoProvincial.votar(juan,13664773);

        Assert.assertEquals(2,pepe.getVotos());
        Assert.assertEquals(1,juan.getVotos());
    }

    @Test
    public void obtengoCandidatosDeUnaProvinca() {
        Candidato pepe = new Candidato("Pepe",Partido.PO,Provincia.BUENOSAIRES);
        Candidato juan = new Candidato("juan",Partido.PRO,Provincia.BUENOSAIRES);
        Candidato carlos = new Candidato("carlos",Partido.PO,Provincia.SANLUIS);
        Candidato zano = new Candidato("zano",Partido.PRO,Provincia.CATAMARCA);
        Votacion pasoProvincial = new Votacion();
        pasoProvincial.agregarCandidato(pepe);
        pasoProvincial.agregarCandidato(juan);
        pasoProvincial.agregarCandidato(carlos);
        pasoProvincial.agregarCandidato(zano);

        List<Candidato> esperado1 = new ArrayList<>();
        esperado1.add(pepe);
        esperado1.add(juan);
        List<Candidato> esperado2 = new ArrayList<>();
        esperado2.add(zano);

        Assert.assertEquals(esperado1,pasoProvincial.getCandidatosDe(Provincia.BUENOSAIRES));
        Assert.assertEquals(esperado2,pasoProvincial.getCandidatosDe(Provincia.CATAMARCA));
    }

}
