package ar.edu.untref.aydoo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by nicopaez on 11/04/2018.
 */
public class Compra {

    private Producto productoDeLaCompra;
    private Calendar fecha;

    public Compra(Producto compra,int dia,int mes, int anio) {
        this.productoDeLaCompra = compra;
        //fecha = new GregorianCalendar(anio, mes, dia);


        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.format(fechaActual);
        //sdf.getCalendar();
        //sdf.format(fecha.get())
        fecha = sdf.getCalendar();
        /*System.out.println(this.getAnio());
        System.out.println(this.getMes());
        System.out.println(this.getDia());*/

    }

    public int valorCompra() {
        return this.productoDeLaCompra.getPrecio();
    }


    public void setFecha(int dia,int mes, int anio) {
        this.fecha.set(anio, mes, dia);
    }

    public int getDia() {
        return this.fecha.get(Calendar.DAY_OF_MONTH);
    }

    public int getMes() {
        return this.fecha.get(Calendar.MONTH);
    }

    public int getAnio() {
        return this.fecha.get(Calendar.YEAR);
    }
}
