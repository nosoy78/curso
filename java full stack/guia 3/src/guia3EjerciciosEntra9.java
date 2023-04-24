/*Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas */

import java.util.Scanner;

///
public class guia3EjerciciosEntra9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ingresado, segundoIngresado, cociente, resto;
        System.out.println("Ingrese primer numero positivo: ");
        ingresado = leer.nextInt();
        System.out.println("Ingrese segundo numero positivo: ");
        segundoIngresado = leer.nextInt();
        resto = 0;
        cociente = 0;
        do {
            resto = ingresado - segundoIngresado;
            cociente++;
            ingresado = resto;
        } while (resto > segundoIngresado);

        System.out.println("Cociente es: " + cociente);
        System.out.println("Resto es: " + resto);

    }
}