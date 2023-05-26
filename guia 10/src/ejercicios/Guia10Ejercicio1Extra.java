import java.util.ArrayList;
import java.util.Scanner;

public class Guia10Ejercicio1Extra {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los valores numéricos (ingresa '-99' para terminar):");

        int valor;
        do {
            valor = scanner.nextInt();
            if (valor != -99) {
                numeros.add(valor);
            }
        } while (valor != -99);

        int cantidadValores = numeros.size();
        int suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }
        double promedio = (double) suma / cantidadValores;

        System.out.println("Número de valores leídos: " + cantidadValores);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}

