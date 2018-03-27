package ar.edu.untref.aydoo;

public class Program {

    protected Program() {
    }

    public static final void main(final String[] arg) {

        String s;
        s = arg[0];
        int numerosaMostrar, primerNumero, segundoNumero, tercerNumero;
        numerosaMostrar = Integer.parseInt(s);
        primerNumero = 0;
        segundoNumero = 1;

        System.out.print("fibo<" + numerosaMostrar + ">: ");

        if (numerosaMostrar > 0)System.out.print(primerNumero + " ");
        if (numerosaMostrar > 1)System.out.print(segundoNumero + " ");

        for (int i = 2; i < numerosaMostrar; i++) {
            tercerNumero = primerNumero + segundoNumero;
            System.out.print(tercerNumero + " ");
            primerNumero = segundoNumero;
            segundoNumero = tercerNumero;
        }

        System.out.println();

    }
}
