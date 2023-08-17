
package Ejercicio2guia13;

import java.util.Arrays;


public class Hangar {
    
    private int numHangar;
    private  String nombreHangar;
    private  String[] nombreAviones = new String[4];
    
    public Hangar(int numHangar, String nombreHangar) {
        this.numHangar = numHangar;
        this.nombreHangar = nombreHangar;
        this.nombreAviones[0] = "CAZA007";
        this.nombreAviones[1] = "DELTA452";
        this.nombreAviones[2] = "ZETA123";
        this.nombreAviones[3] = "ZORRO970";
        
    }

    public int getNumHangar() {
        return numHangar;
    }

    public void setNumHangar(int numHangar) {
        this.numHangar = numHangar;
    }

    public String getNombreHangar() {
        return nombreHangar;
    }

    public void setNombreHangar(String nombreHangar) {
        this.nombreHangar = nombreHangar;
    }

    public String[] getNombreAviones() {
        return nombreAviones;
    }

    public void setNombreAviones(String[] nombreAviones) {
        this.nombreAviones = nombreAviones;
    }

    @Override
    public String toString() {
        return "Hangar{" + "numHangar=" + numHangar + ", nombreHangar=" + nombreHangar + ", nombreAviones=" + Arrays.toString(nombreAviones) + '}';
    }
   
    
    
    
}
