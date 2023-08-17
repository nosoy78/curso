
package Ejercicio6guia13;

public class Ejercicio6guia13 {

   
    public static void main(String[] args) {
     
        Sentencia instanciaA = new Sentencia();
        try {
            System.out.println("Ejecución sin excepción MioException:");
            instanciaA.metodoA(10, 5);

            System.out.println("Ejecución con excepción MioException:");

            instanciaA.metodoA(10, 0);
        } catch (Exception e) {
           
            System.out.println("Excepción capturada: " + e.getMessage());
        }

    }
}
