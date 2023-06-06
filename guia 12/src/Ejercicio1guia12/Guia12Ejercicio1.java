
package Ejercicio1guia12;

import Ejercicio1guia12.entidades.Animal;
import Ejercicio1guia12.entidades.Caballo;
import Ejercicio1guia12.entidades.Gato;
import Ejercicio1guia12.entidades.Perro;


public class Guia12Ejercicio1 {

    
    public static void main(String[] args) {
        /**
         * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro,
         * Gato, Caballo. La clase Animal tendrá como atributos el nombre,
         * alimento, edad y raza del Animal. Crear un método en la clase Animal
         * a través del cual cada clase hija deberá mostrar luego un mensaje por
         * pantalla informando de que se alimenta. Generar una clase Main que
         * realice lo siguiente:
         */
        
        // Declaracion Perro1
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.Alimentacion();
        
        // Declaracion Perro2
        Animal perro2 = new Perro("Toddy", "Arroz", 10, "Calleguero");
        perro2.Alimentacion();
        
        // Declracion Gato
        Animal gato = new Gato("Pelusa", "Pescado", 15, "Siames");
        gato.Alimentacion();
        
        // Declaracion Caballo
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Grueso");
        caballo.Alimentacion();
        
        
    }

}
