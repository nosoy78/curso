
package guia7ejercicioextras5;

import guia7ejercicioextras5.Empleado.Empleado;


public class Guia7EjercicioExtras5 {

   
    public static void main(String[] args) {
        
        /**
         * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
         * "salario". Luego, crea un método "calcular_aumento" que calcule el
         * aumento salarial de un empleado en función de su edad y salario
         * actual. El aumento salarial debe ser del 10% si el empleado tiene más
         * de 30 años o del 5% si tiene menos de 30 años.
         *
         */

        Empleado emp1 = new Empleado();
        
        emp1.cargarEmpleado();
        emp1.calcularAumento();
        
    }

}
