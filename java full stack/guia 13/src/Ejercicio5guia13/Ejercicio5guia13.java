
package Ejercicio5guia13;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5guia13 {

    
    public static void main(String[] args) {
      

        int numeroAdivinar = generarNumeroAleatorio();
        int intentos = 0;

        System.out.println("¡Adivina el número entre 1 y 500!");

        while (true) {
            try {
                int numeroUsuario = obtenerNumero();
                intentos++;

                if (numeroUsuario == numeroAdivinar) {
                    System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intento(s).");
                    break;
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor que " + numeroUsuario + ".");
                } else {
                    System.out.println("El número a adivinar es menor que " + numeroUsuario + ".");
                }
            } catch (InputMismatchException e) {
                intentos++;
                System.out.println("Error: Debes ingresar un número válido.");
                
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
            }
        }
    }

    public static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(500) + 1;
    }

    public static int obtenerNumero() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        return leer.nextInt();
    }
}
