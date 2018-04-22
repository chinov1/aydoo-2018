package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;


public class Cliente {
    private List<Compra> misCompras;

    public Cliente(){
        misCompras = new ArrayList<Compra>();
    }
    public Compra comprar(Libro unLibro) {
        Compra compraNueva = new Compra (unLibro);
        this.misCompras.add(compraNueva);
        return compraNueva;
    }

    public Compra getCompra() {
        return misCompras.get(0);
    }

    public int calcularMontoDelMes() {
        if(misCompras == null){
            return getCompra().valorCompra();
        }else{
            Compra compraIterada;
            int total = 0;
            for(ListIterator<Compra> it = misCompras.listIterator(); it.hasNext(); ){
                compraIterada = it.next();
                total += compraIterada.valorCompra();
            }

            return total;
        }
    }
}
