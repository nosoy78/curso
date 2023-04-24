/* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
   Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
   en caso contrario, se deberá imprimir “INCORRECTO”. 
       Nota: investigar la función Substring y equals() de Java. */

import java.util.Scanner;

public class guia3ejercicio4 {
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase y validaremos si su primer letra es una 'A' o 'a': ");
        frase = leer.next();
        frase = frase.toLowerCase();
        if (frase.substring(0, 1).equals("a")) {
            System.out.println("Correcto!!");
        } else {
            System.out.println("Incorrecto!!");
        }
    }
}