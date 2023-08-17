
package Ejercicio1Extra.servicios;

import Ejercicio1Extra.entidades.Alquiler;

public interface AlquierInter {

    public void crearAlquiler(Alquiler alquiler);

    public double calculoAlquiler(Alquiler alquiler);

    public double diasOcupacion(Alquiler alquiler);

}
