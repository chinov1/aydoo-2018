package ar.edu.untref.aydoo;

public class Program {

    protected Program() {
    }

    public static void main(final String[] arg) {

        String comando = arg[0];

        if (!comando.startsWith("-o=")) {
            System.out.println("Opciones no validas");
            /*
            IMPLEMENTACION VIEJA
            int numerosaMostrar;
            numerosaMostrar = Integer.parseInt(comando);
            Fibonacci fibo = new Fibonacci(numerosaMostrar);
            System.out.print("fibo<" + numerosaMostrar + ">:");

            fibo.mostrarFiboHorizontal();

            System.out.println();*/
        }else{
            if ((comando.charAt(3) == 'h'  || comando.charAt(3) == 'v') &&  (comando.charAt(4) == 'i'  || comando.charAt(4) == 'd')) {
                String numero = arg[1];
                int numerosaMostrar;
                numerosaMostrar = Integer.parseInt(numero);
                Fibonacci fibo = new Fibonacci(numerosaMostrar);
                System.out.print("fibo<" + numerosaMostrar + ">:");
                if (comando.charAt(4) == 'i') {fibo.invertir();}
                switch (comando.charAt(3)){
                    case 'h':   fibo.mostrarFiboHorizontal();
                                break;
                    case 'v':   fibo.mostrarFiboVertical();
                                break;
                }
            }else System.out.println("Opciones no validas");
        }


    }






}
