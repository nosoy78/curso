/*  - Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
    - Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O. 
    - Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
    - Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
    - Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals(). */

import java.util.Scanner;

public class guia3Ejercicios7 {
    public static void main(String[] args) {

        // && (respuesta.substring(-1, 1).equals("O"))

        String respuesta, FDE, inicial, finale;
        int correctas, incorrectas;
        boolean malElNumero, malLimites, malTodo;
        malElNumero = false;
        malLimites = false;
        malTodo = false;
        correctas = 0;
        incorrectas = 0;
        Scanner leer = new Scanner(System.in);
        FDE = "&&&&&";
        do {
            System.out.println(
                    "Ingrese una cadena valida, máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O. ");
            respuesta = leer.next();
            respuesta = respuesta.toUpperCase();

            inicial = respuesta.substring(0, 1);
            finale = respuesta.substring(respuesta.length() - 1, respuesta.length());

            if (respuesta.length() >= 1 && respuesta.length() <= 5) {
                malElNumero = false;
                if ((inicial.equals("X")) && (finale.equals("O"))) {

                    correctas++;
                    malLimites = false;

                } else {

                    malLimites = true;
                    malTodo = false;
                }

            } else {
                malElNumero = true;

            }

            if (malTodo) {
                incorrectas++;
            } else if (malElNumero) {
                incorrectas++;
            } else if (malLimites) {
                incorrectas++;
            }

        } while (!(respuesta.equals(FDE)));

        if (respuesta.equals(FDE)) {
            incorrectas--;

        }
        System.out.println("Correctas " + correctas);
        System.out.println("Incorrectas " + incorrectas);

    }
}