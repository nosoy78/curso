
package Ejercicio2guia13;

import java.util.Scanner;


public class Ejercicio2guia13 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            Hangar h1 = new Hangar(032,"Hangar 01X2");
            
            System.out.println("Hangar nombre :" + h1.getNombreHangar());
            System.out.println("Hangar numero de Serie :" + h1.getNumHangar());
            for (int i = 0; i < 10; i++) {
                System.out.println("La Posicion es :" + i);
                String nombre = h1.getNombreAviones()[i];
                System.out.println("El Nombre del Avion es : " + nombre);
                               
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice Fuera de Rango " + e);
        }
        System.out.println("---- FIN DEL PROGRAMA----");
    }
    
}
