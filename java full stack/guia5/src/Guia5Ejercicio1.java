/**
 Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 */

public class Guia5Ejercicio1 {

    
    public static void main(String[] args) {
       
        int[] Vector = new int[100];
        
        for ( int i = 0 ; i < 100 ; i++){            
            Vector[i] = i;           
        }
       for (int i = Vector.length - 1; i >= 0; i--) {
          System.out.println(Vector[i]);
        }
    }
    
}