
package guia7ejercicioextras2;

import guia7ejercicioextras2.Puntos.Puntos;


public class Guia7EjercicioExtras2 {

  
    public static void main(String[] args) {
       
        /**
         * Definir una clase llamada Puntos que contendrá las coordenadas de dos
         * puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un
         * punto. Generar un objeto puntos usando un método crearPuntos() que le
         * pide al usuario los dos números y los ingresa en los atributos del
         * objeto. Después, a través de otro método calcular y devolver la
         * distancia que existe entre los dos puntos que existen en la clase
         * Puntos. Para conocer como calcular la distancia entre dos puntos
         * consulte el siguiente link:
         */

        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);


    }
    
}