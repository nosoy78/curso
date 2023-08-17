
package Ejercicio4guia13;

import java.util.InputMismatchException;

public class Ejercicio4guia13 {

    
    public static void main(String[] args) {
        
        
        DivisionNumero n = new DivisionNumero();
        
        try {
            int resultado = n.realizarOperacion();
            System.out.println("El resultado de la operación es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es un número válido.");
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no puede convertirse a un entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }
}
