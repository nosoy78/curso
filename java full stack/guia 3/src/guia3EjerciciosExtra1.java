/* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. */

import java.util.Scanner;

public class guia3EjerciciosExtra1 {
    public static void main(String[] args) {
        double tiempoMinutos, dias, horas;

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor de tiempo en minutos: ");
        tiempoMinutos = leer.nextDouble();

        horas = tiempoMinutos / 60; // primero obtenemos el total de horas
        dias = horas / 24; // el valor dias absoluto

        horas = horas - (Math.floor(dias) * 24); // el valor horas - el valor dias en horas redondo - es decir las horas
                                                 // que sobran
        dias = Math.floor(dias); // el valor dias preciso redondeado para abajo

        System.out.println(dias + " Dias");
        System.out.println(horas + " Horas");

    }
}
