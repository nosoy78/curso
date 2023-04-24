/*  Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú: 
    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
    El programa deberá ejecutarse hasta que se elija la opción 5. 
    Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: 
    ¿Está seguro que desea salir del programa (S/N)? 
    Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú. 
 */

import java.util.Scanner;

public class guia3Ejercicios6 {

    public static void main(String[] args) {
        int num1, num2, opcion;

        // double suma, resta, multiplicacion, division;
        boolean confirmacion;
        String confirma;
        confirmacion = false;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese segundo numero: ");
        num2 = leer.nextInt();

        do {
            // String confirma;
            System.out.println("=========MENU===============");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opcion segun su numero: ");
            opcion = leer.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                switch (opcion) {
                    case 1:
                        System.out.println("La suma es: " + (num1 + num2));
                        System.out.println("===================================================");

                        break;
                    case 2:
                        System.out.println("La resta es: " + (num1 - num2));
                        System.out.println("===================================================");

                        break;
                    case 3:
                        System.out.println("La multiplicacion es: " + (num1 * num2));
                        System.out.println("===================================================");

                        break;
                    case 4:
                        System.out.println("La division del primero sobre el segundo es: " + (num1 / num2));
                        System.out.println("===================================================");
                        break;

                }

            } else if (opcion == 5) {
                System.out.print("Esta seguro que desea salir del programa (S/N): ");
                confirma = leer.next();
                confirma.toLowerCase();
                if (confirma.equals("s")) {
                    confirmacion = true;
                    System.out.println("===================================================");

                } else {
                    continue;
                }
            } else {
                System.out.println("Solo valores de 1 a 5");
                System.out.println("===================================================");

            }

        } while (!confirmacion);

    }
}
