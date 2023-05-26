import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Guia10Ejercicio4Extra {
    public static void main(String[] args) {
        Map<String, String> codigosPostales = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Ingreso de Códigos Postales -----");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el código postal " + i + ": ");
            String codigoPostal = scanner.nextLine();
            System.out.print("Ingresa la ciudad asociada al código postal " + i + ": ");
            String ciudad = scanner.nextLine();
            codigosPostales.put(codigoPostal, ciudad);
        }

        System.out.println("----- Datos introducidos -----");
        for (Map.Entry<String, String> entry : codigosPostales.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }

        System.out.print("Ingresa un código postal para buscar la ciudad asociada: ");
        String codigoPostalBusqueda = scanner.nextLine();
        if (codigosPostales.containsKey(codigoPostalBusqueda)) {
            System.out.println("La ciudad asociada al código postal " + codigoPostalBusqueda + " es: " + codigosPostales.get(codigoPostalBusqueda));
        } else {
            System.out.println("No se encontró la ciudad asociada al código postal " + codigoPostalBusqueda);
        }

        System.out.println("----- Agregar una ciudad -----");
        System.out.print("Ingresa el código postal: ");
        String codigoPostalAgregar = scanner.nextLine();
        System.out.print("Ingresa la ciudad asociada al código postal: ");
        String ciudadAgregar = scanner.nextLine();
        codigosPostales.put(codigoPostalAgregar, ciudadAgregar);

        System.out.println("----- Eliminar 3 ciudades -----");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingresa el código postal de la ciudad a eliminar " + i + ": ");
            String codigoPostalEliminar = scanner.nextLine();
            if (codigosPostales.containsKey(codigoPostalEliminar)) {
                codigosPostales.remove(codigoPostalEliminar);
                System.out.println("Se ha eliminado la ciudad asociada al código postal " + codigoPostalEliminar);
            } else {
                System.out.println("No se encontró la ciudad asociada al código postal " + codigoPostalEliminar);
            }
        }

        System.out.println("----- Datos actualizados -----");
        for (Map.Entry<String, String> entry : codigosPostales.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }
    }
}
