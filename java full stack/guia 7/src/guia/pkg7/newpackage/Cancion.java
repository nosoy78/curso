
package guia7ejercicioextras1.Cancion;

import java.util.Scanner;


public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }
    
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void Ingreso(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese titulo : ");
        this.titulo = leer.nextLine();
        System.out.print("Ingrese autor : ");
        this.autor = leer.nextLine();
    }
}
