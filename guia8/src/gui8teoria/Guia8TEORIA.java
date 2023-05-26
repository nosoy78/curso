
package guia8teoria;


public class Guia8TEORIA {

   
    public static void main(String[] args) {
        /**
         * Ejercicio void Crea un método void que reciba un objeto tipo persona
         * como parámetro y utilice el get para mostrar sus atributos.Llama ese
         * método desde el main.
         */
         Persona persona = new Persona("Fernando", 45);
         mostrarPersona(persona);
         
  }

    public static void mostrarPersona(Persona persona) {
      System.out.println("Nombre: " + persona.getNombre());
      System.out.println("Edad: " + persona.getEdad());
    }
}
