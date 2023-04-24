
package guia7ejercicioextras6;

import guia7ejercicioextras6.Rectangulo.Rectanguloo;




public class Guia7EjercicioExtras6 {

    
    public static void main(String[] args) {
        
        /**
         * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y
         * un método "calcular_area" que calcule y devuelva el área del
         * rectángulo. Luego crea un objeto "rectangulo1" de la clase
         * "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
         */
        Rectanguloo rectangulo1 = new Rectanguloo(4, 6);
        double area = rectangulo1.calcular_area();
        System.out.println("El área del rectángulo es: " + area);
        
    }

}
