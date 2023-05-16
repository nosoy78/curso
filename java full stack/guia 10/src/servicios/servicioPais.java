
package servicios;

import java.util.Scanner;
import java.util.TreeSet;
import javafx.scene.transform.Scale;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class servicioPais {
//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.

    
        Scanner leer = new Scanner (System.in);
        TreeSet<String> ListaPaises = new TreeSet<>();
        
        public void ingresoPais(){
        String pais;
        String resp;
        
            do {        
                System.out.println("Ingrese un pais a la lista");
                pais = leer.nextLine();
                ListaPaises.add(pais);
                System.out.println("Desea ingrasar otro pais ? S/N: ");
                resp = leer.nextLine();
                                     
                
            } while ("S".equals(resp.toUpperCase()));
            
            System.out.println("-----LISTA DE PAISES----");
            ListaPaises.forEach((ListaPaise) -> {
                System.out.println(ListaPaise);
                });
            System.out.println("");
            }
        public void eliminarpais() {
            String paiseliminado;
            boolean aux = false;
            String resp;
            
            do {
                System.out.println("Ingrese un pais para eliminar de la lista: ");
                paiseliminado = leer.nextLine();
                for (String listaPaise : ListaPaises ) {
                    if (listaPaise.equals(paiseliminado)) {
                        ListaPaises.remove(listaPaise);
                        aux = true;
                        break;
                        
                    }
                    
                }
                if (aux == false) {
                    System.out.println("El pais no se encuentra en al lista");
                   
                }
                System.out.println("Desea eliminar otro pais ? S/N : ");
                resp = leer.nextLine();
                
            } while ("S".equals(resp.toUpperCase()));
            System.out.println("----LISTA CON PAIS/ES ELIMINADO/ES ----");
            ListaPaises.forEach((pais) -> {
                System.out.println(pais);
             });   
        }

            
        }
        
       
    
    

