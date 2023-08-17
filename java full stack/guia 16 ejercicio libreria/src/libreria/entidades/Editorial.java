
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Editorial implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String nombre;
    private boolean alta;

    public Editorial() {
         this.alta = true;
    }
    
    public Editorial(Integer id, String nombre, boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String aux;
        if (alta){
            aux = "De Alta";
        } else {
            aux = "De Baja";
        }
        return "\n---- Editorial ----: " + "\n ID : " + id + "\n Nombre : " + nombre + "\n Alta : " + aux;
    }
    
    
    
}
