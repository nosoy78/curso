/* Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
 Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
    Nota: recordar que las variables de tipo entero truncan los números o resultados */

import java.util.Scanner;

///
public class guia3EjerciciosExtra11 {
    public static void main(String[] args) {
        double introducido, dividido;
        int contador;
        boolean condition = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para contar sus cifras: ");
        contador = 1;
        introducido = leer.nextInt();
        dividido = introducido / 10;
        if (dividido >= 1) {
            do {
                if (dividido >= 10) {
                    dividido = Math.floor((dividido / 10));
                    contador++;
                } else {
                    contador++;
                    break;
                }
            } while (condition);
        }
        System.out.println("Contador de cifras es: " + contador);
    }
}