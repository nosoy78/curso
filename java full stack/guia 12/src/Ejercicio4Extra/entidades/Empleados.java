
package Ejercicio4Extra.entidades;

public class Empleados extends Persona {
    private int anioIncorporacion;
    private int numDespacho;

    public Empleados() {
    }

    public Empleados(int anioIncorporacion, int numDespacho, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(nombre, apellidos, estadoCivil, numIdentificacion);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return "año de incorporacion = " + anioIncorporacion + ", numero de despacho = " + numDespacho + ", ";
    }
    
    
}
