/*Una obra social tiene tres clases de socios:
    ○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
    ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
    ○ Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
    ○ Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio. */
////
import java.util.Scanner;

//
public class guia3EjerciciosExtra5 {
    public static void main(String[] args) {

        String respuestaABC;
        double valortratamiento;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tipo de socio, A, B o C: ");
        respuestaABC = leer.nextLine();
        respuestaABC = respuestaABC.toLowerCase();

        if (!(respuestaABC.equals("a")) && !(respuestaABC.equals("b")) && !(respuestaABC.equals("c"))) {
            System.out.println("Solo socios tipo A, B o C");
        } else {
            if (respuestaABC.equals("a")) {
                System.out.println("Ingrese el valor del tratamiento realizado:  ");
                valortratamiento = leer.nextDouble();
                System.out.println(
                        "Ingreso A, el valor del tratamiento es: $ " + (valortratamiento - (valortratamiento * 0.5)));
            }
            if (respuestaABC.equals("b")) {
                System.out.println("Ingrese el valor del tratamiento realizado:  ");
                valortratamiento = leer.nextDouble();
                System.out.println(
                        "Ingreso B, el valor del tratamiento es: $ " + (valortratamiento - (valortratamiento * 0.35)));

            }
            if (respuestaABC.equals("c")) {
                System.out.println("Ingrese el valor del tratamiento realizado:  ");
                valortratamiento = leer.nextDouble();
                System.out.println(
                        "Ingreso C, el valor del tratamiento es: $ " + (valortratamiento));
            }

        }
    }
}
