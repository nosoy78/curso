
package Ejercicio3guia13;

import java.util.Scanner;


public class Ejercicio3guia13 {

    
    
        
         public static void main(String[] args) {
        

        try {

            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese el primer numero : ");
            String num1 = leer.nextLine();
            System.out.println("Ingrese el segundo numero : ");
            String num2 = leer.nextLine();

            DivisionNumero n = new DivisionNumero();

            System.out.println("Division : " + n.parseInt(num2, num1));

        } catch (ArithmeticException e) {
            System.out.println("Error Aritmetico : " + e);
        } catch (Exception e) {
            System.out.println("Error General : " + e);
        }
    }
}
    
    

