
package Ejercicio2y3guia12.entidades;

import Ejercicio2y3guia12.servicio.Electrodomestico;
import java.util.Scanner;

public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean sintoTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintoTDT, double precio, String color, char consumoEnergia, int peso) {
        super(precio, color, consumoEnergia, peso);
        this.resolucion = resolucion;
        this.sintoTDT = sintoTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintoTDT() {
        return sintoTDT;
    }

    public void setSintoTDT(boolean sintoTDT) {
        this.sintoTDT = sintoTDT;
    }

    public void crearTelevisor() {

       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("--- TELEVISOR ---");
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del Televisor : ");
        this.resolucion = leer.nextInt();
        System.out.println("Ingrese, tiene sintonisador TDT ? S/N : ");
        String resp = leer.next();
        if (resp.equals("S")) {
            this.sintoTDT = true;
        }
    }

    
    @Override
    public void precioFinal() {
       
        super.precioFinal();
        if (resolucion > 40) {
            setPrecio(getPrecio() * 1.3 );  
        }

        if (sintoTDT) {
            setPrecio(getPrecio()+ 500); 
        }
    }

    @Override
    public String toString() {
        String aux;
        if (sintoTDT){
            aux = "Tiene";
        }else{
            aux = "No tiene";
        } 
        return super.toString() + " Televisor{" + "resolucion=" + resolucion + ", sintoTDT=" + aux + '}';
    }
}