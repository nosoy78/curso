
package guia7ejercicio4;

import guia7ejercicio4.Rectangulo.Rectangulo;


public class Guia7Ejercicio4 {

   
    public static void main(String[] args) {
        
        /**
         * Crear una clase Rectángulo que modele rectángulos por medio de un
         * atributo privado base y un atributo privado altura. La clase incluirá
         * un método para crear el rectángulo con los datos del Rectángulo dados
         * por el usuario. También incluirá un método para calcular la
         * superficie del rectángulo y un método para calcular el perímetro del
         * rectángulo. Por último, tendremos un método que dibujará el
         * rectángulo mediante asteriscos usando la base y la altura. Se deberán
         * además definir los métodos getters, setters y constructores
         * correspondientes. Superficie = base * altura / Perímetro = (base +
         * altura) * 2.
         */
        
        Rectangulo var1 = new Rectangulo();
        
        var1.crearParametros();
        var1.Perimetro();
        var1.Superficie();
        var1.Dibujar();
        
        
        
        
        
        
        
                
                
    }
    
}