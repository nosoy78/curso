
package guia11teoria_jugador;

import equipo.Equipo;
import java.util.ArrayList;
import jugador.Jugador;

public class Guia11TEORIA_JUGADOR {

    public static void main(String[] args) {
        

        /**
         * EJERCICIO JUGADOR Realiza un programa en donde exista una clase
         * Jugador que contenga nombre, apellido, posición y número. Luego otra
         * clase Equipo que contenga una colección de jugadores. Una vez hecho
         * esto, desde el main recorreremos el equipo mostrando la información
         * de cada jugador.
         */
        
        Jugador p1 = new Jugador("Fernando", "Frugoni", "A", 45);
        Jugador p2 = new Jugador("Veronica", "De Jesus", "B", 40);
        Jugador p3 = new Jugador("Nicolas", "Frugoni", "C", 14);
        Jugador p4 = new Jugador("Valentina", "Frugoni", "D", 9);
        
        ArrayList<Jugador> listaJugadores = new ArrayList();
        
        listaJugadores.add(p1);
        listaJugadores.add(p2);
        listaJugadores.add(p3);
        listaJugadores.add(p4);
        
        Equipo e1 = new Equipo();
        
        e1.setJugadores(listaJugadores);
        
        System.out.println(e1.toString());
        
    }

}
