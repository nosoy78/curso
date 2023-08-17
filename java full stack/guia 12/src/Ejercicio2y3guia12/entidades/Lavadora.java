
package Ejercicio2y3guia12.entidades;

import Ejercicio2y3guia12.servicio.Electrodomestico;
import java.util.Scanner;


public class Lavadora extends Electrodomestico {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergia, int peso) {
        super(precio, color, consumoEnergia, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavador() {
      
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("--- LAVADORA ---");
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la Lavadora : ");
       
        setCarga(leer.nextInt());
    }

    @Override
    public void precioFinal() {
       
        super.precioFinal();
        if (carga > 30){
            setPrecio(getPrecio() + 500 );
        }
    }

    @Override
    public String toString() { 
        return super.toString() + " Lavadora{" + "carga=" + carga + '}';
    }

    
}