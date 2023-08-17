
package Ejercicio4Extra.servicios;

import Ejercicio4Extra.entidades.Empleados;

public class PersonalServicios extends Empleados {
    private String seccion;

    public PersonalServicios() {
    }

    public PersonalServicios(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, estadoCivil, numIdentificacion);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "seccion = " + seccion + ".";
    }

    
}
