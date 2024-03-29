
package persona;

import perro.Perro;

public class Persona {
    
    private String nombre;
    private String apeliido;
    private int dni;
    private int edad;
    private Perro perro = new Perro();

    public Persona() {
    }

    public Persona(String nombre, String apeliido, int dni, int edad, Perro perro) {
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.dni = dni;
        this.edad = edad;
        this.perro = perro;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona { "+"Nombre: " + nombre + " - Apeliido: " + apeliido + " - DNI: " + dni + " - Edad: "
                + edad + " }" + "\n Su " + perro.toString();
    }
    
    
    
}