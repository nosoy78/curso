/* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.  
       Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”. */
//
import java.util.Scanner;

//
public class guia3EjerciciosExtra7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out
                .println("Ingrese el N, es decir, un numero mayor a 0 para usar como cantidad de numeros a promediar");
        int N = leer.nextInt();
        // int contador = 0;
        int contador = 0;
        double ingresado, total, promedio;
        total = 0;
        promedio = 0;
        // do {
        // contador++;
        // System.out.println("Ingrese un numero: ");
        // ingresado = leer.nextDouble(); // version do - while
        // total = total + ingresado;
        // } while (contador < N);

        while (contador < N) {
            System.out.println("Ingrese un numero: ");
            ingresado = leer.nextDouble();
            if (ingresado < 0) {
                System.out.println("solo numeros positivos");
                continue;
            }
            total = total + ingresado;
            contador++;
        }
        System.out.println("total es " + total);
        System.out.println("El promedio es: " + (total / N));
    }
}