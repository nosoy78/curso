
package libreria.persistencia;

import java.sql.SQLClientInfoException;
import libreria.entidades.Editorial;

public class EditorialDAO extends DAO<Editorial>{
    
    public void guardarEditorial(Editorial Editorial) throws Exception{
        
        Editorial autorExistente = buscarEditorialNombre(Editorial.getNombre());
        if (autorExistente != null) {
            System.out.println("Ya existe una Editorial con el mismo nombre.");
        }
        super.guardar(Editorial);
    }
    
    
    
    public void editarEditorial(Editorial Editorial) throws Exception{
        super.editar(Editorial);     
    }
    
    public void darDeAltaEditorial(Integer id) throws Exception {
        
        Editorial editorial = buscarEditorialId(id);
        if (editorial != null) {
            editorial.setAlta(true);
            super.editar(editorial);
        }
    }

    public void darDeBajaEditorial(Integer id) throws Exception {
        Editorial editorial = buscarEditorialId(id);
        if (editorial != null) {
            editorial.setAlta(false);
            super.editar(editorial);
        }
    }
    
    public Editorial buscarEditorialId(Integer id) throws Exception {
        
        System.out.println("[Buscando Editorial]");
        
        Editorial editorial;
        try {
            super.conectar();
            
            editorial = em.find(Editorial.class, id);
            
            System.out.println(" Encontrado : " + editorial);
            
            desconectar();
            return editorial;
        } catch (SQLClientInfoException eSQL) {
            System.out.println(" Error al Buscar Editorial ");
            System.out.println(eSQL);
            return null;
        }
    }
    
    public Editorial buscarEditorialNombre(String nombre) throws Exception {

        System.out.println("[Buscando Editorial]");

        conectar();
        Editorial libro = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre)
                .getSingleResult();
        desconectar();
        return libro;
    }
}
