
package guia11teoria_persona;

import dni.Dni;
import persona.Persona;

public class Guia11TEORIA_PERSONA {

    public static void main(String[] args) {
        

        /**
         * EJERCICIO PERSONA Realiza un programa en donde una clase Persona
         * tenga como atributo nombre, apellido y un objeto de clase Dni. La
         * clase Dni tendrá como atributos la serie (carácter) y número. Prueba
         * acceder luego a los atributos del dni de la persona creando objetos y
         * jugando desde el main.
         */
        
        Dni d = new Dni("B", 11223344);
        
        Persona p = new Persona("Fernando","Frugoni", d);
        
        System.out.println(p);
        
        
        
    }

}
