
package Ejercicio2Extra.entidades;

import java.util.ArrayList;


public class EdificioDeOficinas extends Edificio{
    ArrayList<Piso> pisos;

    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }
    

    public EdificioDeOficinas(ArrayList<Piso> pisos,float alto, float largo, float ancho) {
        super.setAlto(alto);
        super.setAlto(largo);
        super.setAlto(ancho);
        this.pisos = pisos;
    }

    public EdificioDeOficinas() {
    }

    

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + super.toString() + " pisos=" + pisos + " "+  '}';
    }

    
    
    @Override
    public float calcularSuperficie() {
        return (super.getAncho() * super.getLargo());
    }

    @Override
    public float calcularVolumen() {
        return (super.getAncho() * super.getLargo() * super.getAlto());
    }
    
    
    
}
