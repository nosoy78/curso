
package Ejercicio2y3guia12;

import Ejercicio2y3guia12.servicio.Electrodomestico;
import Ejercicio2y3guia12.entidades.Lavadora;
import Ejercicio2y3guia12.entidades.Televisor;
import java.util.ArrayList;


public class Guia12Ejercicio2y3 {

   
    public static void main(String[] args) {
        /**
         * Crear una superclase llamada Electrodoméstico con los siguientes
         * atributos: precio, color, consumo energético (letras entre A y F) y
         * peso. Los constructores que se deben implementar son los siguientes:
         * • Un constructor vacío. • Un constructor con todos los atributos
         * pasados por parámetro. Los métodos a implementar son: • Métodos
         * getters y setters de todos los atributos. • Método
         * comprobarConsumoEnergetico(char letra): comprueba que la letra es
         * correcta, sino es correcta usara la letra F por defecto. Este método
         * se debe invocar al crear el objeto y no será visible. • Método
         * comprobarColor(String color): comprueba que el color es correcto, y
         * si no lo es, usa el color blanco por defecto. Los colores disponibles
         * para los electrodomésticos son blanco, negro, rojo, azul y gris. No
         * importa si el nombre está en mayúsculas o en minúsculas. Este método
         * se invocará al crear el objeto y no será visible.
         *
         * • Metodo crearElectrodomestico(): le pide la información al usuario y
         * llena el electrodoméstico, también llama los métodos para comprobar
         * el color y el consumo. Al precio se le da un valor base de $1000. •
         * Método precioFinal(): según el consumo energético y su tamaño,
         * aumentará el valor del precio. Esta es la lista de precios:
         *
         * A continuación, se debe crear una subclase llamada Lavadora, con el
         * atributo carga, además de los atributos heredados. Los constructores
         * que se implementarán serán: • Un constructor vacío. • Un constructor
         * con la carga y el resto de los atributos heredados. Recuerda que
         * debes llamar al constructor de la clase padre. Los métodos que se
         * implementara serán: • Método get y set del atributo carga. • Método
         * crearLavadora (): este método llama a crearElectrodomestico() de la
         * clase padre, lo utilizamos para llenar los atributos heredados del
         * padre y después llenamos el atributo propio de la lavadora. • Método
         * precioFinal(): este método será heredado y se le sumará la siguiente
         * funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio
         * en $500, si la carga es menor o igual, no se incrementará el precio.
         * Este método debe llamar al método padre y añadir el código necesario.
         * Recuerda que las condiciones que hemos visto en la clase
         * Electrodoméstico también deben afectar al precio. Se debe crear
         * también una subclase llamada Televisor con los siguientes atributos:
         * resolución (en pulgadas) y sintonizador TDT (booleano), además de los
         * atributos heredados. Los constructores que se implementarán serán: •
         * Un constructor vacío. • Un constructor con la resolución,
         * sintonizador TDT y el resto de los atributos heredados. Recuerda que
         * debes llamar al constructor de la clase padre. LETRA PRECIO A $1000 B
         * $800 C $600 D $500 E $300 F $100
         *
         * PESO PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79
         * kg $800 Mayor que 80 kg $1000
         *
         * Los métodos que se implementara serán: • Método get y set de los
         * atributos resolución y sintonizador TDT. • Método crearTelevisor():
         * este método llama a crearElectrodomestico() de la clase padre, lo
         * utilizamos para llenar los atributos heredados del padre y después
         * llenamos los atributos del televisor. • Método precioFinal(): este
         * método será heredado y se le sumará la siguiente funcionalidad. Si el
         * televisor tiene una resolución mayor de 40 pulgadas, se incrementará
         * el precio un 30% y si tiene un sintonizador TDT incorporado,
         * aumentará $500. Recuerda que las condiciones que hemos visto en la
         * clase Electrodomestico también deben afectar al precio. Finalmente,
         * en el main debemos realizar lo siguiente: Vamos a crear una Lavadora
         * y un Televisor y llamar a los métodos necesarios para mostrar el
         * precio final de los dos electrodomésticos.
         */
        
        System.out.println("EJERCICIO GUIA12 NUMERO 2");

       
        Electrodomestico elec = new Electrodomestico(1000d, "Gris", 'A', 80);
        Lavadora lav = new Lavadora(45, 1500d, "Negro", 'Z', 45);
        Televisor tel = new Televisor(50, true, 3000d, "Violeta", 'C', 55);
       
        lav.comprobarConsumoEnergetico(lav.getConsumoEnergia());
        tel.comprobarColor(tel.getColor());

        elec.precioFinal();
        System.out.println(elec.toString());
        lav.precioFinal();
        System.out.println(lav.toString());
        tel.precioFinal();
        System.out.println(tel.toString());
       
        
        System.out.println("EJERCICIO GUIA12 NUMERO 3");
        
        ArrayList<Electrodomestico> electros = new ArrayList<>();
        double sumaElectro = 0;
        double sumaLava = 0;
        double sumaTele = 0;
        
        Lavadora lav2 = new Lavadora(65, 2000d, "Negro", 'C', 65);
        Lavadora lav3 = new Lavadora(45, 1500d, "Blanca", 'A', 45);
        Televisor tel2 = new Televisor(50, true, 5000d, "Negro", 'A', 55);
        Televisor tel3 = new Televisor(32, false, 3500d, "Gris", 'C', 55);
        
        electros.add(lav2);
        electros.add(lav3);
        electros.add(tel2);
        electros.add(tel3);
        
        System.out.println("-- LISTA DE PRECIOS --");
        for (Electrodomestico electro : electros) {
            System.out.println("Precio : " + electro.getPrecio());
            sumaElectro += electro.getPrecio();
            if (electro instanceof Lavadora) {
                sumaLava += electro.getPrecio();
            } else if (electro instanceof Televisor) {
                sumaTele += electro.getPrecio();
            }
        }
        
        System.out.println("Precio Total de todos los Electrodomesticos : " + sumaElectro);
        System.out.println("Precio Total de las Lavadoras : " + sumaLava);
        System.out.println("Precio Total de los Televisores : " + sumaTele);
    }

}