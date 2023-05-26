
import java.util.HashSet;
import java.util.Scanner;

public class serviciolibreria {

    private HashSet<Libro> libros;

    public serviciolibreria() {
        libros = new HashSet<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void prestamo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.getEjemplaresPrestados() < libro.getEjemplares()) {
                    libro.incrementarEjemplaresPrestados();
                    System.out.println("Se ha realizado el préstamo del libro: " + libro.getTitulo());
                    return;
                } else {
                    System.out.println("No hay ejemplares disponibles para préstamo del libro: " + libro.getTitulo());
                    return;
                }
            } else {
            }
        }
        System.out.println("No se encontró el libro: " + titulo);
    }

    public void devolucion(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.getEjemplaresPrestados() > 0) {
                    libro.decrementarEjemplaresPrestados();
                    System.out.println("Se ha realizado la devolución del libro: " + libro.getTitulo());
                    return;
                } else {
                    System.out.println("No hay ejemplares prestados del libro: " + libro.getTitulo());
                    return;
                }
            }
        }
        System.out.println("No se encontró el libro: " + titulo);
    }

    public void mostrarLibros() {
        System.out.println("----- Libros en la Librería -----");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        System.out.println("---------------------------------");
    }
}
