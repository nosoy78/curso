
package estancias.servicios;

import estancias.entidades.*;
import estancias.persistencia.casasDAO;
import java.util.ArrayList;

public class casasServicio {
    
    public void listarCasas(String opc) throws Exception {

        casasDAO fdao = new casasDAO();
        ArrayList<casas> casas;
      
        casas = fdao.listarCasas(opc);
        
        for (casas aux : casas) {
            System.out.println(aux.toString());
        }
    }
    
}
