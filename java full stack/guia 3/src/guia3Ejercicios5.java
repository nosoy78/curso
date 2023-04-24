/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.  
 */

import java.util.Scanner;

public class guia3Ejercicios5 {

    public static void main(String[] args) {

        int limite, ingresa2, suma;
        suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese valor limite: ");
        limite = leer.nextInt();

        do {
            System.out.println(limite);
            System.out.print("Ingrese un numero: ");
            ingresa2 = leer.nextInt();
            suma = suma + ingresa2;
        } while (suma <= limite);

        System.out.println("El total de la suma fue: " + suma);

    }

}
