package arregloservicio;

import java.util.Arrays;
import static java.util.Collections.reverseOrder;

public class ArregloServicio {

    public void inicializarA(double[] A) {
        /**
         * Método inicializarA recibe un arreglo por parámetro y lo inicializa
         * con números aleatorios.
         */
        for (int i = 0; i < A.length; i++) {
            int numeroAleatorio = (int) (Math.random() * 50);
            A[i] = numeroAleatorio;
        }
    }

    public void mostrar(double[] A) {
        /**
         * Método mostrar recibe un arreglo por parámetro y lo muestra por
         * pantalla.
         */
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public void ordenar(double[] A) {
        /**
         * Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a
         * menor.
         */
        System.out.println("Vector A de mayor a menor");
        for (int i = 0; i < 50; i++) {
            Arrays.sort(A);
        }
        for (int i = 0; i < 50; i++) {

        }
        System.out.println("");

        for (int i = 49; i > 0; i--) {
            System.out.println(A[i]);

        }
    }

    public void inicializarB(double[] A, double[] B) {
        /**
         * Método inicializarB copia los primeros 10 números del arreglo A en el
         * arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con
         * 0.5.
         */
        //for (int i = 0; i < 10; i++) {
        //    B[i] = A[i];
        //}
        System.arraycopy(A, 0, B, 0, 10);
        for (int i = 10; i < B.length; i++) {
            B[i] = 0.5;
        }
    }
}
