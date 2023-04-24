


import java.util.Scanner;


public class Gui4Ejercicio4 {

    
    public static void main(String[] args) {
             
        /**
         * Crea una aplicación que nos pida un número por teclado y con una
         * función se lo pasamos por parámetro para que nos indique si es o no
         * un número primo, debe devolver true si es primo, sino false. Un
         * número primo es aquel que solo puede dividirse entre 1 y sí mismo.
         * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin
         * embargo, 17 si es primo.
         */
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = leer.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
