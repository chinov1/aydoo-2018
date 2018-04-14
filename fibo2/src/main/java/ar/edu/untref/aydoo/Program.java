package ar.edu.untref.aydoo;

public class Program {

    protected Program() {
    }

    public static void main(final String[] arg) {

        String comando = arg[0];
        int numerosaMostrar;

        try {
            numerosaMostrar = Integer.parseInt(comando);        //Busco una excepcion
            comando = "-o=hd";
        }catch(Exception e){
            numerosaMostrar = Integer.parseInt(arg[1]);         //Si sale una excepcion asumo q fue invocado de la nueva manera
        }


        if (!comando.startsWith("-o=")) {
            System.out.println("Opciones no validas");
        } else {
            if ((comando.charAt(3) == 'h'  || comando.charAt(3) == 'v') &&  (comando.charAt(4) == 'i'  || comando.charAt(4) == 'd')) {


                Fibonacci fibo = new Fibonacci(numerosaMostrar);
                System.out.print("fibo<" + numerosaMostrar + ">:");
                if (comando.charAt(4) == 'i') {fibo.invertir(); }
                switch (comando.charAt(3)) {
                    case 'h':   fibo.mostrarFiboHorizontal();
                                break;
                    case 'v':   fibo.mostrarFiboVertical();
                                break;
                }
            } else System.out.println("Opciones no validas");
        }


    }






}
