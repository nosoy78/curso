
/* Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java. */
import java.util.Scanner;
///
public class guia3EjerciciosExtra10 {
    public static void main(String[] args) {
        double aleatorio1, aleatorio2, multiplo, respuesta;
        int confirma;
        Scanner leer = new Scanner(System.in);
        aleatorio1 = Math.floor(Math.random() * 10);
        aleatorio2 = Math.floor(Math.random() * 10);
        multiplo = aleatorio1 * aleatorio2;

        // System.out.println(aleatorio1);
        // System.out.println(aleatorio2);
        // System.out.println(multiplo);

        confirma = 1;

        do {

            System.out.println("Ingrese el resultado de la multiplicacion de los 2 numeros generados aleatoriamente: ");
            respuesta = leer.nextDouble();

            if (respuesta == multiplo) {
                System.out.println("Respuesta Correcta!!!");
                break;

            } else {
                System.out.println("Respuesta Incorrecta.");
                System.out.println("Desea intentar nuevamente? - Ingrese 1 para Si, Ingrese 2 Para No: ");
                confirma = leer.nextInt();
                if (confirma == 1) {
                    System.out.println("Buena suerte la proxima! ");
                } else {
                    break;
                }

            }
        } while (confirma == 1);

    }
}