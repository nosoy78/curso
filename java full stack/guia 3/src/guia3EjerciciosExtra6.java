/* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general. */
//
import java.util.Scanner;

//
public class guia3EjerciciosExtra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas a medir: ");
        int cantidadPersonas = leer.nextInt();
        if (cantidadPersonas > 0) {
            int contadorPetisos, contadorgeneral;
            double alturaPromedio, alturaPromedioPetisos;
            contadorPetisos = 0;
            contadorgeneral = 0;
            double alturaTotal = 0;
            double alturaPetisosTotal = 0;
            for (int i = 1; i <= cantidadPersonas; i++) {
                System.out.println("Ingrese el valor de altura del numero: " + i);
                double altura = leer.nextDouble();
                alturaTotal = alturaTotal + altura;
                if (altura < 1.60) {
                    contadorPetisos++;
                    alturaPetisosTotal = alturaPetisosTotal + altura;
                    System.out.println("Promedio petisos");
                }
                contadorgeneral++;
            }
            alturaPromedioPetisos = alturaPetisosTotal / contadorPetisos;
            System.out.println("Promedio altura petisos: " + alturaPromedioPetisos);
            alturaPromedio = alturaTotal / contadorgeneral;
            System.out.println("Altura promedio general: " + alturaPromedio);
        }
    }
}