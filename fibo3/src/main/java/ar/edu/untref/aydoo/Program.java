package ar.edu.untref.aydoo;

public class Program {

    protected Program() {
    }

    public static void main(final String[] arg) {

        String textoDeSalida;
        String comandoOrientaciones = arg[0];
        int numerosaMostrar = Integer.parseInt(arg[arg.length-1]);
        try {
            numerosaMostrar = Integer.parseInt(comandoOrientaciones);        //Busco una excepcion parseando letras
            comandoOrientaciones = "-o=hd";                                  //si pasa no son letras, y fue invocado de la manera "vieja", asumo horizontal y directa
        } catch (Exception e) {
            //numerosaMostrar = Integer.parseInt(arg[1]);
        }

        if (comandoOrientaciones.startsWith("-o=") && (comandoOrientaciones.charAt(3) == 'h'  || comandoOrientaciones.charAt(3) == 'v') &&  (comandoOrientaciones.charAt(4) == 'i'  || comandoOrientaciones.charAt(4) == 'd')) {
                Fibonacci fibo = new Fibonacci(numerosaMostrar);        //calculo serie

                if (comandoOrientaciones.charAt(4) == 'i') {                 //la invierto si hace falta
                    fibo.invertir();
                }

                textoDeSalida = "fibo<" + numerosaMostrar + ">:";     //muestro
                switch (comandoOrientaciones.charAt(3)) {
                    case 'h':   textoDeSalida += fibo.mostrarFiboHorizontal();
                                break;
                    case 'v':   textoDeSalida += fibo.mostrarFiboVertical();
                                break;
                }

        } else textoDeSalida = "Opciones no validas";


        System.out.println(textoDeSalida);


        }




    }







