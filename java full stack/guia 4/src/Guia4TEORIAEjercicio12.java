
import java.util.Scanner;


public class Guia4TEORIAEjercicio12 {

    public static void main(String[] args) {
       
        /**
         * Ejercicio 12 Crea un procedimiento EsMultiplo que reciba los dos
         * números pasados por el usuario, validando que el primer número
         * múltiplo del segundo e imprima si el primer número es múltiplo del
         * segundo, sino informe que no lo son.
         */
        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese 2 numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        EsMultiplo(num1,num2);
    }
public static void EsMultiplo(int num1, int num2){

            if (num1 % num2 == 0) {
            System.out.println("El " + num1 + " es multiplo de " + num2);
        } else {
            System.out.println("Los numeros no son multiplos");
        }
}
}