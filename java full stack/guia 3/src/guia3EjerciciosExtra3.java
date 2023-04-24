/* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String. */
//
import java.util.Scanner;

//
public class guia3EjerciciosExtra3 {
    public static void main(String[] args) {
        String letra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese una letra: ");
        letra = leer.next();
        letra = letra.toLowerCase();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
