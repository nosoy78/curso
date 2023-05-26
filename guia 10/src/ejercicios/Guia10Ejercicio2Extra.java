import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia10Ejercicio2Extra {
    private String nombre;
    private String discoConMasVentas;

   

    public static void main(String[] args) {
        ArrayList<CantanteFamoso> cantantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        cantantes.add(new CantanteFamoso("Cantante 1", "Disco 1"));
        cantantes.add(new CantanteFamoso("Cantante 2", "Disco 2"));
        cantantes.add(new CantanteFamoso("Cantante 3", "Disco 3"));
        cantantes.add(new CantanteFamoso("Cantante 4", "Disco 4"));
        cantantes.add(new CantanteFamoso("Cantante 5", "Disco 5"));

        while (!salir) {
            System.out.println("----- Menú -----");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir del programa");
            System.out.print("Ingresa tu opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del cantante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el disco con más ventas: ");
                    String disco = scanner.nextLine();
                    cantantes.add(new CantanteFamoso(nombre, disco));
                    System.out.println("Cantante agregado correctamente.");
                    break;
                case 2:
                    System.out.println("----- Lista de Cantantes -----");
                    for (CantanteFamoso cantante : cantantes) {
                        System.out.println("Nombre: " + cantante.getNombre());
                        System.out.println("Disco con más ventas: " + cantante.getDiscoConMasVentas());
                        System.out.println("-----------------------------");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el nombre del cantante a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    boolean encontrado = false;
                    for (CantanteFamoso cantante : cantantes) {
                        if (cantante.getNombre().equalsIgnoreCase(nombreEliminar)) {
                            cantantes.remove(cantante);
                            System.out.println("Cantante eliminado correctamente.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró un cantante con ese nombre.");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Ingresa un número del 1 al 4.");
                    break;
            }
        }

        System.out.println("----- Lista de Cantantes Final -----");
        for (CantanteFamoso cantante : cantantes) {
            System.out.println("Nombre: " + cantante.getNombre());
            System.out.println("Disco con más ventas: " + cantante.getDiscoConMasVentas());
            System.out.println("-----------------------------");
        }
    }
}
