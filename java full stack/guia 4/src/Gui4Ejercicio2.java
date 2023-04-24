


import java.util.Scanner;


public class Gui4Ejercicio2 {

  
    public static void main(String[] args) {
      
        /**
         * Diseñe una función que pida el nombre y la edad de N personas e
         * imprima los datos de las personas ingresadas por teclado e indique si
         * son mayores o menores de edad. Después de cada persona, el programa
         * debe preguntarle al usuario si quiere seguir mostrando personas y
         * frenar cuando el usuario ingrese la palabra “No”.
         */
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        boolean seguir = true;
        
        while(seguir) {
            System.out.println("Ingrese el nombre de la persona:");
            nombre = leer.nextLine();
            System.out.println("Ingrese la edad de " + nombre + ":");
            edad = leer.nextInt();
            leer.nextLine(); 
            
            Mayordeedad(nombre,edad);
            
            System.out.println("¿Quiere seguir ingresando personas? (Si/No)");
            String respuesta = leer.nextLine();
            seguir = respuesta.equalsIgnoreCase("Si");
   
    }
    }       
public static void Mayordeedad(String nombre, int edad){
    if (edad >= 18) {
        System.out.println(nombre + " es mayor de edad.");
    } else {
        System.out.println(nombre + " es menor de edad.");
    }
} 
}
