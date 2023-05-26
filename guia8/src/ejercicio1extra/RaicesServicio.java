
package raicesservicio;

import java.util.Scanner;
import raices.Raices;


public class RaicesServicio {
    
    Raices r = new Raices();
    
    public void valores() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Primer Numero");
        r.setA(leer.nextInt());
        System.out.println("Ingrese el Segundo Numero");
        r.setB(leer.nextInt());
        System.out.println("Ingrese el Tercer Numero");
        r.setC(leer.nextInt());
    }

    public double getDiscriminante() {
        /**
         * Método getDiscriminante(): devuelve el valor del discriminante
         * (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
         */
        return ((r.getB() * r.getB()) - 4 * r.getA() * r.getC());
    }

    public boolean tieneRaices() {
        /**
         * Método tieneRaices(): devuelve un booleano indicando si tiene dos
         * soluciones, para que esto ocurra, el discriminante debe ser mayor o
         * igual que 0.
         */
        double tr = getDiscriminante();
        return tr > 0;
    }

    public boolean tieneRaiz() {
        /**
         * Método tieneRaiz(): devuelve un booleano indicando si tiene una única
         * solución, para que esto ocurra, el discriminante debe ser igual que
         * 0.
         */
        double tr = getDiscriminante();
        return tr == 0;
    }

    public void obtenerRaices() {
       
        if (tieneRaices()) {
           
            double raiz1 = (-r.getB() + Math.sqrt(getDiscriminante())) / (2 * r.getA());
            double raiz2 = (-r.getB() - Math.sqrt(getDiscriminante())) / (2 * r.getA());
            System.out.println("Las soluciones son: " + raiz1 + " y " + raiz2);
        }
    }

    public void obtenerRaiz() {
        /**
         * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́  true imprime
         * una única raíz. Es en el caso en que se tenga una única solución
         * posible.
         */
         if (tieneRaiz()) {
            double raiz = -r.getB() / (2 * r.getA());
            System.out.println("La única solución es: " + raiz);
        }
    }
    
    public void calcular() {
        if (tieneRaices() ) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No hay soluciones reales.");
        }
    }
}
