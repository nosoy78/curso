
package entidades;

import java.util.ArrayList;

public class libreria {
    
    private String Titulo;
    private String EjemplaresPrestados;
    private String Ejemplares;

    public libreria() {
    }

    public libreria(String Titulo, String EjemplaresPrestados, String Ejemplares) {
        this.Titulo = Titulo;
        this.EjemplaresPrestados = EjemplaresPrestados;
        this.Ejemplares = Ejemplares;
    }
    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEjemplaresPrestados() {
        return EjemplaresPrestados;
    }

    public void setEjemplaresPrestados(String EjemplaresPrestados) {
        this.EjemplaresPrestados = EjemplaresPrestados;
    }

    public String getEjemplares() {
        return Ejemplares;
    }

    public void setEjemplares(String Ejemplares) {
        this.Ejemplares = Ejemplares;
    }
    
    

    }
    

