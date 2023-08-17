
package estancias.servicios;

import estancias.entidades.*;
import estancias.persistencia.familiasDAO;
import java.util.ArrayList;

public class familiasServicio {

    public void listarFamilias(String opc) throws Exception {

        familiasDAO fdao = new familiasDAO();
        ArrayList<familias> familias = new ArrayList();
        if (opc.equals("a")) {
            familias = fdao.listarfamilia(opc);
        }
        if (opc.equals("d")) {
            familias = fdao.listarfamilia(opc);
        }
        for (familias aux : familias) {
            System.out.println(aux.toString());
        }
    }
}
