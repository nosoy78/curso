
package Ejercicio2Extra.entidades;

import Ejercicio2Extra.Enums.TipoDeInstalacion;


public class Polideportivo extends Edificio{
    
    private String nombre;
    private TipoDeInstalacion tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, TipoDeInstalacion tipo,float alto, float largo, float ancho) {
        
        super.setAlto(alto);
        super.setAlto(largo);
        super.setAlto(ancho);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public TipoDeInstalacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeInstalacion tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + super.toString() + " tipo=" + tipo + " " +  '}';
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
