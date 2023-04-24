
package guia7ejercicio1;

import java.util.Scanner;


public class libro1 {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public libro1() {
       
    }
    
    public libro1(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de ISBN del libro: ");
        this.ISBN = leer.nextLine();
        System.out.println("Ingrese el título del libro: ");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        this.autor = leer.nextLine();
        System.out.println("Ingrese el número de páginas del libro: ");
        this.numPaginas = leer.nextInt();
    }
    
    public void mostrarInformacion() {
        System.out.println("Número de ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}
