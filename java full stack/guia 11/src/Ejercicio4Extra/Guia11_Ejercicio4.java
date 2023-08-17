package Ejercicio4Extra;

import Ejercicio4Extra.entidad.Alumnos;
import Ejercicio4Extra.servivio.Simulador;
import java.util.ArrayList;


public class Guia11_Ejercicio4 {

    
    public static void main(String[] args) {
        
        Simulador servicioSimulador = new Simulador();
         
        System.out.println("Bienvenidos! EGG Rotos");
        
        
        
        ArrayList<String> alumnos = servicioSimulador.generarListaAlumnos();
        System.out.println(alumnos);
        ArrayList<Integer> dnis = servicioSimulador.generarListaDNI(alumnos);
        System.out.println(dnis);
        ArrayList<Alumnos> ListaAlumnosCompleta = servicioSimulador.crearAlumno(dnis, alumnos);
        
        servicioSimulador.mostrarAlumnos(ListaAlumnosCompleta);
        
       
        
        servicioSimulador.mostrarVotos(servicioSimulador.votacion(ListaAlumnosCompleta));
        servicioSimulador.recuentoVotos(ListaAlumnosCompleta);
        servicioSimulador.facilitadores(ListaAlumnosCompleta);
        
    }
    
}
