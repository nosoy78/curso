import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro(String titulo, String autor, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public boolean prestamo() {
        if (numEjemplares - numEjemplaresPrestados > 0) {
            numEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo +
                ", Autor: " + autor +
                ", Ejemplares: " + numEjemplares +
                ", Ejemplares prestados: " + numEjemplaresPrestados;
    }
}

class Libreria {
    private Set<Libro> libros;

    public Libreria() {
        libros = new HashSet<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public boolean prestamo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro.prestamo();
            }
        }
        return false;
    }

    public boolean devolucion(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro.devolucion();
            }
        }
        return false;
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}

public class Guia10Ejercicio3Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();

        boolean agregarLibro = true;
        while (agregarLibro) {
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.print("Ingrese el número de ejemplares del libro: ");
            int numEjemplares = Integer.parseInt(scanner.nextLine());

            Libro libro = new Libro(titulo, autor, numEjemplares);
            libreria.agregarLibro(libro);

            System.out.print("¿Desea agregar otro libro? (S/N): ");
            String opcion = scanner.nextLine();
            agregarLibro = opcion.equalsIgnoreCase("S");
        }

        System.out.println("----- Libros agregados -----");
        libreria.mostrarLibros();

        System.out.print("Ingrese el título del libro a prestar: ");
        String tituloPrestamo = scanner.nextLine();
        boolean prestamoRealizado = libreria.prestamo(tituloPrestamo);
        if (prestamoRealizado) {
            System.out.println("Se ha realizado el préstamo del libro: " + tituloPrestamo);
        } else {
            System.out.println("No se puede realizar el préstamo del libro: " + tituloPrestamo);
        }

        System.out.print("Ingrese el título del libro a devolver: ");
        String tituloDevolucion = scanner.nextLine();
        boolean devolucionRealizada = libreria.devolucion(tituloDevolucion);
        if (devolucionRealizada) {
            System.out.println("Se ha realizado la devolución del libro: " + tituloDevolucion);
        } else {
            System.out.println("No se puede realizar la devolución del libro: " + tituloDevolucion);
        }

        System.out.println("----- Libros actualizados -----");
        libreria.mostrarLibros();
    }
}

