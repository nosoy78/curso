


import java.util.Scanner;


public class Gui4Ejercicio3 {

   
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
        double cantidadEuros;
        int monedaDestino;
        
        System.out.println("Introduce la cantidad de euros que quieres convertir:");
        cantidadEuros = leer.nextDouble();
        leer.nextLine();
        
        System.out.println("Introduce la moneda a la que quieres convertir (Opcion 1 - Libras / 2 - Dólares / 3 - Yenes):");
        monedaDestino = leer.nextInt();
        
        convertirMoneda(cantidadEuros, monedaDestino);
    }
    
    public static void convertirMoneda(double cantidadEuros, int monedaDestino) {
        double cantidadDestino = 0;
        
        switch (monedaDestino) {
            case 1:
                cantidadDestino = cantidadEuros * 0.86;
                System.out.println(cantidadEuros + " euros son " + cantidadDestino + " libras.");
                break;
            case 2:
                cantidadDestino = cantidadEuros * 1.28611;
                System.out.println(cantidadEuros + " euros son " + cantidadDestino + " dólares.");
                break;
            case 3:
                cantidadDestino = cantidadEuros * 129.852;
                System.out.println(cantidadEuros + " euros son " + cantidadDestino + " yenes.");
                break;
            default:
                System.out.println("Moneda no válida.");
        }
    }
    
}