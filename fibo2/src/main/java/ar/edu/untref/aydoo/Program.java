package ar.edu.untref.aydoo;

public class Program {

    protected Program() {
    }

    public static void main(final String[] arg) {

        String comando = arg[0];
        int numerosaMostrar;

        try {
            numerosaMostrar = Integer.parseInt(comando);        //Busco una excepcion parseando letras
            comando = "-o=hd";                                  //si pasa no son letras, y fue invocado de la manera "vieja", asumo horizontal y directa
        } catch (Exception e) {
            numerosaMostrar = Integer.parseInt(arg[1]);
        }

        if (comando.startsWith("-o=") && (comando.charAt(3) == 'h'  || comando.charAt(3) == 'v') &&  (comando.charAt(4) == 'i'  || comando.charAt(4) == 'd')) {
                Fibonacci fibo = new Fibonacci(numerosaMostrar);        //calculo serie

                if (comando.charAt(4) == 'i') {                 //la invierto si hace falta
                    fibo.invertir();
                }

                System.out.print("fibo<" + numerosaMostrar + ">:");     //muestro
                switch (comando.charAt(3)) {
                    case 'h':   fibo.mostrarFiboHorizontal();
                                break;
                    case 'v':   fibo.mostrarFiboVertical();
                                break;
                }

        } else System.out.println("Opciones no validas");

        }


    }







