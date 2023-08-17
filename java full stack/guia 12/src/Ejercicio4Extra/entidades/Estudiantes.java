
package Ejercicio4Extra.entidades;

public class Estudiantes extends Persona {
    private int matricula;

    public Estudiantes() {
    }

    public Estudiantes(int matricula, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(nombre, apellidos, estadoCivil, numIdentificacion);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {

        return super.toString() + "Estudiantes{" + "matricula=" + matricula + '}';

    }
    
    
}
