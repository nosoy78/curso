
package Guia12Teoria_Interfaz;

import Guia12Teoria_Interfaz.entidad.NewInterface;


public class Guia12TEORIA_INTERFAZ {

    
    public static void main(String[] args) {
        /**
         * Vamos a crear una interfaz con un método abstracto. Luego desde el
         * main intentaremos instanciar un objeto a partir de la interfaz
         */
        
        Clase p = new Clase();
        
        p.saludar();
        p.adios();
                
    }
}

class Clase implements NewInterface {

    @Override
    public void saludar() {
        System.out.println("Holis.... ");
    }

    @Override
    public void adios() {
        System.out.println("Adiozzzz ");
    }
    
}
