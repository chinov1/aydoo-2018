package ar.edu.untref.aydoo;

public class Fibonacci {

    int[] fibo;

    public Fibonacci(int cantidadDeNumeros) {
        fibo  = this.calcularFiboConLongitud(cantidadDeNumeros);
    }




    private int[] calcularFiboConLongitud(int longitud){
        int[] salida = new int[longitud];
        int primerNumero, segundoNumero, tercerNumero;
        primerNumero = 0;
        segundoNumero = 1;

        if (longitud > 0)salida[0] = 0;
        if (longitud > 1)salida[1] = 1;

        for (int i = 2; i < longitud; i++) {
            tercerNumero = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = tercerNumero;
            salida[i] = tercerNumero;
        }
        return salida;
    }

    public void mostrarFibo(){
        for (int i = 0; i < this.fibo.length; i++){
            System.out.print(" " + this.fibo[i]);
        }
    }

}
