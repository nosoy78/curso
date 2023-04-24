// Crear un programa que dado un numero determine si es par o impar

import java.util.Scanner;

public class guia3ejercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es impar");
        }
    }
}