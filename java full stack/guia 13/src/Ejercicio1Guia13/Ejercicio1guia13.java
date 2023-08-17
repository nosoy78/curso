package Ejercicio1Guia13;

import Ejercicio1Guia13.entidad.Persona;
import Ejercicio1Guia13.servicio.PersonaServicio;


public class Ejercicio1guia13 {

    
    public static void main(String[] args) {

        PersonaServicio n1 = new PersonaServicio();
        Persona p1 = new Persona("Fernando", 45, "Masculino", 85, 173);
        Persona p2 = new Persona("Veronica", 40, "Femenino", 70, 165);
        Persona p3 = null;

        Persona[] Vector = new Persona[4];

        Vector[0] = p1;
        Vector[1] = p2;
        Vector[2] = p3;

        try {
            for (int i = 0; i < 4; i++) {
                Persona p = Vector[i];
                if (n1.esMayorDeEdad(p)) {
                    System.out.println(n1.getNombre(p) + "  Es Mayor de Edad");
                } else {
                    System.out.println(n1.getNombre(p) + "  Es Menor de Edad");
                }
                switch (n1.calcularIMC(p)) {
                    case 1:
                        System.out.println(n1.getNombre(p) + "  Debajo del Peso Ideal");
                    case 0:
                        System.out.println(n1.getNombre(p) + "  Peso Ideal");
                    case -1:
                        System.out.println(n1.getNombre(p)+"");

                   
                }

            }

        } catch (Exception e) {
            System.out.println(" Objeto Vacio");
        }
    }

}
