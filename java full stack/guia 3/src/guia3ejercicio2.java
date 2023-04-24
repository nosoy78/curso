/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de incorrecto. 
Nota: investigar la función equals() en Java.*/

import java.util.Scanner;

public class guia3ejercicio2 {
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase correcta: ");
        frase = leer.next();
        frase = frase.toLowerCase();
        if (frase.equals("eureka")) {
            System.out.println("Correcto!!");
        } else {
            System.out.println("Incorrecto!!");
        }
    }
}