package ar.edu.untref.aydoo;

import java.text.SimpleDateFormat;
import java.util.*;


public class Cliente {
    private List<Compra> misCompras;

    public Cliente(){
        misCompras = new ArrayList<Compra>();
    }
    public Compra comprar(Libro unLibro) {
        Compra compraNueva = new Compra (unLibro,19,12,1990);
        this.misCompras.add(compraNueva);
        return compraNueva;
    }

    public Compra getCompra() {
        return misCompras.get(0);
    }

    public int calcularComprasDelMes(int mes, int anio) {
        if(misCompras == null){
            return getCompra().valorCompra();
        }else{
            Compra compraIterada;
            int total = 0;
            for(ListIterator<Compra> it = misCompras.listIterator(); it.hasNext(); ){
                compraIterada = it.next();
                if(mes == compraIterada.getMes() && anio == compraIterada.getAnio()){
                    total += compraIterada.valorCompra();
                }

            }

            return total;
        }
    }
    public int calcularComprasDelMes() {

        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.format(fechaActual);


        return this.calcularComprasDelMes(sdf.getCalendar().get(Calendar.MONTH),sdf.getCalendar().get(Calendar.YEAR));


    }


    public int calcularComprasDelAnio() {
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.format(fechaActual);
        int total = 0;

        for (int i = 0; i<12; i++){
            total += calcularComprasDelMes(i,sdf.getCalendar().get(Calendar.YEAR));

        }
        
        return total;

    }
}
