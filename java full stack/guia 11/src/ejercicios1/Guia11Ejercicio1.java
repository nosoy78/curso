
package ejercicios1;

import ejercicios1.entidad.Perro;
import ejercicios1.servicio.Persona;


public class Guia11Ejercicio1 {

    public static void main(String[] args) {
        

        /**
         * Realizar un programa para que una Persona pueda adoptar un Perro.
         * Vamos a contar de dos clases. Perro, que tendrá como atributos:
         * nombre, raza, edad y tamaño; y la clase Persona con atributos:
         * nombre, apellido, edad, documento y Perro. Ahora deberemos en el main
         * crear dos Personas y dos Perros. Después, vamos a tener que pensar la
         * lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
         * mostrar desde la clase Persona, la información del Perro y de la
         * Persona.
         */
        
        Perro p1 = new Perro( "Yago","Obejero", 12 ,"grande");
        Perro p2 = new Perro( "Lola","Salchicha", 3 ,"Chico");
        
        Persona per1 = new Persona("Fernando", "Pelado", 44556633, 45 , p2);
        Persona per2 = new Persona("Veronica", "Chiquita", 11223344, 40 , p1);
        
        System.out.println(per1.toString());
        System.out.println(per2.toString());
        
    }

}
