package Ejercicio1Guia13.servicio;

import Ejercicio1Guia13.entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    public PersonaServicio() {
        
    }
    
    public String getNombre(Persona n){
        return n.getNombre();
    }
    
    public boolean esMayorDeEdad(Persona n) {
      
        return (n.getEdad() >= 18);
    }

    public Persona crearPersona() {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el Nombre :");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el Edad :");
        int edad = leer.nextInt();

        System.out.println("Ingrese el Sexo H/M/O : ");
        
        String sexo = leer.next();
        
        if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println(" Usted Ingreso mal el Sexo, vuelva a ingresarlo :");
            sexo = leer.nextLine();
        } 
     
        
        System.out.println("Ingrese el Peso :");
        int peso = leer.nextInt();

        System.out.println("Ingrese el Altura en Centimetros :");
        int altura = leer.nextInt();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(Persona n) {
        
        int Peso = n.getPeso();
        int Altura =  n.getAltura();
        int IMC = 2;
        
        if ( Peso/(Altura*Altura) < 20 ){
            IMC = -1;  
        }
        if (Peso/(Altura*Altura) >= 20 && Peso/(Altura*Altura) <= 25){
            IMC = 0;  
        }
        if ( Peso/(Altura*Altura) > 25 ){
            IMC = 1;  
        }
        return IMC;        
    }

}