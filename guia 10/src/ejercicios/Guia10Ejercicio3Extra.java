package ejercicios;

import entidades.libreria;
import java.util.HashSet;
import java.util.Scanner;


public class Guia10Ejercicio3Extra {

    public static void main(String[] args) {
        serviciolibreria libreria = new serviciolibreria();
        Scanner scanner = new Scanner(System.in);
        boolean crearLibro = true;

        while (crearLibro) {
            System.out.println("----- Creación de Libro -----");
            System.out.print("Ingresa el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingresa el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.print("Ingresa el número de ejemplares: ");
            int ejemplares = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            Libro libro = new Libro(titulo, autor, ejemplares);
            libreria.agregarLibro(libro);

            System.out.print("¿Deseas crear otro libro? (s/n): ");
            String opcion = scanner.nextLine();
            if (!opcion.equalsIgnoreCase("s")) {
                crearLibro = false;
            }
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("----- Menú -----");
            System.out.println("1. Realizar préstamo de un libro");
            System.out.println("2. Realizar devolución de un libro");
            System.out.println("3. Mostrar todos los libros");
            System.out.println("4. Salir del programa");
            System.out.print("Ingresa tu opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el título del libro a prestar: ");
                    String tituloPrestamo = scanner.nextLine();
                    libreria.prestamo(tituloPrestamo);
                    break;
                case 2:
                    System.out.print("Ingresa el título del libro a devolver: ");
                    String tituloDevolucion = scanner.nextLine();
                    libreria.devolucion(tituloDevolucion);
                    break;
                case 3:
                    libreria.mostrarLibros();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Ingresa un número del 1 al 4.");
                    break;
            }
        }
    }

}
/**
 * 
 */