
/**
 * Ejercicio 13y14 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad
 * de compañeros de equipo y define su tipo de dato de tal manera que te permita
 * alojar sus nombres más adelante.
 */
public class Guia5TEORIAEjer13y14 {

 
    public static void main(String[] args) {
        
        String[] Equipo = new String[5];
        
        
        Equipo[0] = "PALERMO ALVARO";
        Equipo[1] = "FERNANDEZ JIMENA";
        Equipo[2] = "FERNANDO FRUGONI";
        Equipo[3] = "DIAZ MAXIMILIANO";
        Equipo[4] = "COLANTONIO LUDMILA";
        
        for (int i = 0 ; i < 4 ; i++){
           System.out.println("[" + Equipo[i] + "]");
                
        } 
        
    }
    
}