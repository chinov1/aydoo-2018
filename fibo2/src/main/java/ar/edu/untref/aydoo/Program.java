package ar.edu.untref.aydoo;

public class Program {

    protected Program() {
    }

    public static void main(final String[] arg) {

        String comando = arg[0];

        if (comando.charAt(0) != '-') {
            int numerosaMostrar;
            numerosaMostrar = Integer.parseInt(comando);
            Fibonacci fibo = new Fibonacci(numerosaMostrar);
            System.out.print("fibo<" + numerosaMostrar + ">:");

            fibo.mostrarFiboHorizontal();

            System.out.println();
        }else{
            String numero = arg[1];
            if(comando.charAt(3) == 'h'){
                int numerosaMostrar;
                numerosaMostrar = Integer.parseInt(numero);
                Fibonacci fibo = new Fibonacci(numerosaMostrar);
                System.out.print("fibo<" + numerosaMostrar + ">:");

                if(comando.charAt(4) == 'd'){
                }
                if(comando.charAt(4) == 'i'){
                    fibo.invertir();
                }
                fibo.mostrarFiboHorizontal();

                System.out.println();
            }else if(comando.charAt(3) == 'v'){
                int numerosaMostrar;
                numerosaMostrar = Integer.parseInt(numero);
                Fibonacci fibo = new Fibonacci(numerosaMostrar);
                System.out.print("fibo<" + numerosaMostrar + ">:");

                if(comando.charAt(4) == 'd'){
                }
                if(comando.charAt(4) == 'i'){
                    fibo.invertir();
                }
                fibo.mostrarFiboVertical();

                System.out.println();
            }
        }


    }






}
