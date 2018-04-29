package ar.edu.untref.aydoo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Program {

    protected Program() {
    }

    public static void main(final String[] arg) {

        String textoDeSalida =  "";
        char horizontalVertical = 'h';
        char directaInversa = 'd';
        char listaSumatoria = 'l';
        String comandoOrientaciones = arg[0];
        int numerosaMostrar = Integer.parseInt(arg[arg.length-1]);
/*
        try {
            numerosaMostrar = Integer.parseInt(comandoOrientaciones);        //Busco una excepcion parseando letras
            comandoOrientaciones = "-o=hd";                                  //si pasa no son letras, y fue invocado de la manera "vieja", asumo horizontal y directa
        } catch (Exception e) {
            //numerosaMostrar = Integer.parseInt(arg[1]);
        }*/

        String principioDelComando = "";
        for (String comandoActual:arg) {
            if (comandoActual.length()>3) {
                principioDelComando = comandoActual.substring(0, 3);
                switch (principioDelComando) {
                    case "-o=":
                        horizontalVertical = comandoActual.charAt(3);
                        directaInversa = comandoActual.charAt(4);
                        break;
                    case "-m=":
                        listaSumatoria = comandoActual.charAt(3);
                        break;
                }

            }
        }

        Fibonacci fibo = new Fibonacci(numerosaMostrar);
        if (directaInversa == 'i') {                 //la invierto si hace falta
            fibo.invertir();
        }

        switch (listaSumatoria) {
            case 'l':
                if ((horizontalVertical == 'h' || horizontalVertical == 'v') && (directaInversa == 'i' || directaInversa == 'd')) {
                textoDeSalida = "fibo<" + numerosaMostrar + ">:";     //muestro
                switch (horizontalVertical) {
                    case 'h':
                        textoDeSalida += fibo.mostrarFiboHorizontal();
                        break;
                    case 'v':
                        textoDeSalida += fibo.mostrarFiboVertical();
                        break;
                }

                } else textoDeSalida = "Opciones no validas";
                break;
            case 's':
                textoDeSalida = "fibo<" + numerosaMostrar + ">s:";
                if (horizontalVertical == 'h') textoDeSalida += " ";
                if (horizontalVertical == 'v') {textoDeSalida += "\r\n";}
                textoDeSalida += fibo.sumatoria();
                break;
        }

        if(arg.length > 1) {
            if (arg[1].startsWith("-f=")) {
                String archivoSalida = arg[1].substring(3);
                System.out.println("fibo<" + numerosaMostrar + "> guardado en " + archivoSalida);
                PrintWriter writer = null;
                try {
                    writer = new PrintWriter(archivoSalida, "UTF-8");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                writer.print(textoDeSalida);
                writer.close();
            } else {
                System.out.println(textoDeSalida);
            }
        }else System.out.println(textoDeSalida);


        }




    }







