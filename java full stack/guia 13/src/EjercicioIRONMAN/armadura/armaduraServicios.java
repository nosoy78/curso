
package EjercicioIRONMAN.armadura;

import EjercicioIRONMAN.entidades.Botas;
import EjercicioIRONMAN.entidades.Cascos;
import EjercicioIRONMAN.entidades.Esqueleto;
import EjercicioIRONMAN.entidades.Generador;
import EjercicioIRONMAN.entidades.Guantes;
import java.util.Scanner;

public class armaduraServicios extends Esqueleto {

    public Esqueleto crearArmadura() {

        Esqueleto armadura;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-- CREACION DE ARMADURA --");

        
        System.out.println("Seleccione una opción:");
        System.out.println("1. Creación manual");
        System.out.println("2. Creación automática");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                armadura = crearArmaduraManual();
                break;
            case 2:
                armadura = crearArmaduraAutomatica2();
                break;
            default:
                System.out.println("Opción inválida. Se creará la armadura de forma automática.");
                armadura = crearArmaduraAutomatica2();
                break;
        }

        return armadura;

    }

   
    public Esqueleto crearArmaduraAutomatica2() {
        
        Esqueleto armaduraAU = new Esqueleto();

        System.out.println("-- CREACION AUTOMATICA DE ARMADURA --");

       
        Botas botaIzquierda2 = new Botas(true);
        Botas botaDerecha2 = new Botas(true);
        Guantes guanteIzquierdo2 = new Guantes(50, true);
        Guantes guanteDerecho2 = new Guantes(60, true);
        Cascos casco2 = new Cascos(true);
        Generador bateria2 = new Generador(100, true);

       
        String nombreArmadura2 = "Armadura Automática";
        armaduraAU.setNombreArmadura(nombreArmadura);
        armaduraAU.setColorPrimario(colorPrimario);

       
        String colorPrimario2 = "Rojo";
        armaduraAU.setColorPrimario(colorPrimario2);

        
        String colorSecundario2 = "Negro";
        armaduraAU.setColorSecundario(colorSecundario2);

       
        int resistencia2 = 150;
        armaduraAU.setResistencia(resistencia2);

        
        armaduraAU.setBotaIzquierda(botaIzquierda2);
        armaduraAU.setBotaDerecha(botaDerecha2);
        armaduraAU.setGuanteIzquierdo(guanteIzquierdo2);
        armaduraAU.setGuanteDerecho(guanteDerecho2);
        armaduraAU.setCasco(casco2);
        armaduraAU.setBateria(bateria2);
        armaduraAU.nivelSalud = 100;
        return armaduraAU;
    }

    
    private Esqueleto crearArmaduraManual() {
        Esqueleto armadura = new Esqueleto();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-- CREACION MANUAL DE ARMADURA --");

        
        System.out.print("Nombre de la armadura: ");
        String nombreArmadura1 = leer.next();
        armadura.setNombreArmadura(nombreArmadura);

      
        System.out.print("Color primario: ");
        String colorPrimario1 = leer.next();
        armadura.setColorPrimario(colorPrimario);

       
        System.out.print("Color secundario: ");
        String colorSecundario1 = leer.next();
        armadura.setColorSecundario(colorSecundario);

        
        System.out.print("Resistencia: ");
        int resistencia1 = leer.nextInt();
        armadura.setResistencia(resistencia);

        
        Botas botaIzquierda1 = new Botas(true);
        Botas botaDerecha1 = new Botas(true);

        
        System.out.print("Daño del guante izquierdo: ");
        int danioGuanteIzquierdo = leer.nextInt();
        Guantes guanteIzquierdo1 = new Guantes(danioGuanteIzquierdo, true);

        System.out.print("Daño del guante derecho: ");
        int danioGuanteDerecho = leer.nextInt();
        Guantes guanteDerecho1 = new Guantes(danioGuanteDerecho, true);

        Cascos casco1 = new Cascos(true);

        
        System.out.print("Capacidad del generador: ");
        float capacidadGenerador = leer.nextFloat();
        Generador bateria1 = new Generador(capacidadGenerador, true);

       
        armadura.setBotaIzquierda(botaIzquierda);
        armadura.setBotaDerecha(botaDerecha);
        armadura.setGuanteIzquierdo(guanteIzquierdo);
        armadura.setGuanteDerecho(guanteDerecho);
        armadura.setCasco(casco);
        armadura.setBateria(bateria);

        return armadura;
    }

}
