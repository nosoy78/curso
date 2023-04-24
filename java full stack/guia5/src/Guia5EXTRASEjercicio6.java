
package guia5extrasejercicio6;

import java.util.Scanner;

/**
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
* a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
* de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
* en una fila que será seleccionada de manera aleatoria. 
* Una vez concluida la ubicación de las palabras, 
* rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
* Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
* funciones de Java substring(), Length() y Math.random().
 */

public class Guia5EXTRASEjercicio6 {

   
    public static void main(String[] args) {
       
         Scanner leer = new Scanner(System.in);

       
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra " + (i + 1) + " de 3 a 5 caracteres: ");
            palabras[i] = leer.nextLine();
           
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("Error: la palabra debe tener entre 3 y 5 caracteres. Ingrese de nuevo: ");
                palabras[i] = leer.nextLine();
            }
        }
        
       
        char[][] sopa = new char[20][20];      
         
        int columnaActual = 0;
        for (String palabra : palabras) {
            
            int longitud = palabra.length();
            if (columnaActual + longitud <= 20) {
                int filaSeleccionada = (int) (Math.random() * 20 );
                for (int i = 0; i < longitud; i++) {
                    sopa[filaSeleccionada][columnaActual + i] = palabra.charAt(i);
                }
                columnaActual += longitud + 1; 
            }
        }

        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) ('a' + (int) (Math.random() * 10));
                }
            }
        }

       
        System.out.println("Sopa de letras:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
        
    
