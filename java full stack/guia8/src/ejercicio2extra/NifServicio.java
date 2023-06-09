
package nifservicios;

import java.util.Scanner;
import nif.Nif;


public class NifServicio {
    
    char[] VectorLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    Nif dni = new Nif();

    public NifServicio() {
    }
    
    public void crearNif(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el DNI : ");
        long DNI = leer.nextLong();
        dni.setDNI(DNI);
        int resto = (int) DNI % 23;
        char letra = VectorLetras[resto];
        dni.setLetra(letra);  
    }
    
    public void mostrar(){
        
        System.out.println("DNI : " + dni.getDNI() + "-" + dni.getLetra());
        
    }
    
}