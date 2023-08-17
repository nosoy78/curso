
package guia11extrasejercicio1;

import perro.Perro;
import persona.Persona;
import servicioadopcion.servicioAdopcion;

public class Guia11ExtrasEjercicio1 {

    public static void main(String[] args) {
       

        /**
         * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
         * Nuestro programa va a tener que contar con muchas personas y muchos
         * perros. El programa deberá preguntarle a cada persona, que perro
         * según su nombre, quiere adoptar. Dos personas no pueden adoptar al
         * mismo perro, si la persona eligió un perro que ya estaba adoptado, se
         * le debe informar a la persona. Una vez que la Persona elige el Perro
         * se le asigna, al final deberemos mostrar todas las personas con sus
         * respectivos perros.
         */
    
    
        servicioAdopcion adop = new servicioAdopcion();
    
        System.out.println("---CENTRO DE ADOPCION ANIMAL---");
        adop.listaPerros();
        adop.listaPersonas();
        adop.adoptarPerro();
        
    }

}