
package Ejercicio4Extra.entidades;

public class Profesor extends Empleados {
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIncorporacion, int numDespacho, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, estadoCivil, numIdentificacion);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "departamento = " + departamento + ".";
    }

    
    
    
}
