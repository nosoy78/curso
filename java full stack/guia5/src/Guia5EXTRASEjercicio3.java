
import java.util.Random;

public class Guia5EXTRASEjercicio3 {

    /**
     * Crear una función rellene un
     * vector con números aleatorios, pasándole un arreglo por parámetro.
     * Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
      
      int n = 5; 
        int[] vector = new int[n];
       
        rellenarVector(vector);
        
        imprimirVector(vector);
    }
    public static void rellenarVector(int vector[]) {
        Random randon = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = randon.nextInt(10);
        }
    }
    public static void imprimirVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

}