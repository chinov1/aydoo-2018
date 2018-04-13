package ar.edu.untref.aydoo;

public class Program {

    protected Program() {
    }

    public static void main(final String[] arg) {

        String s;
        s = arg[0];
        int numerosaMostrar;
        numerosaMostrar = Integer.parseInt(s);

        Fibonacci fibo = new Fibonacci(numerosaMostrar);


        System.out.print("fibo<" + numerosaMostrar + ">:");
        fibo.mostrarFibo();


        System.out.println();

    }






}
