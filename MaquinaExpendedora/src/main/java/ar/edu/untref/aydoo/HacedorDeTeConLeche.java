package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {
    public void hacer(Vaso unVaso) {
        Tetero micafetero = new Tetero();
        micafetero.hacer(unVaso);

        Lechero miLechero = new Lechero();
        miLechero.poner(unVaso);
    }
}
