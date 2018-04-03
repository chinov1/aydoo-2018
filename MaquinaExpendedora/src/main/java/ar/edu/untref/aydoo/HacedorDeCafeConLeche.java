package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {
    public void hacer(Vaso unVaso){
        Cafetero micafetero = new Cafetero();
        micafetero.hacer(unVaso);

        Lechero miLechero = new Lechero();
        miLechero.poner(unVaso);
    }
}
