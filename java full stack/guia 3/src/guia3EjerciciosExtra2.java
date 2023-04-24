/* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
   A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. */

public class guia3EjerciciosExtra2 {
    public static void main(String[] args) {
        int A, B, C, D, X;
        A = 1;
        B = 2;
        C = 3;
        D = 4;
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);

        X = B;
        B = C;
        C = A;
        A = D;
        D = X;

        System.out.println(
                "A tomo el valor de D: " + A + " ---- B tomo el valor de C: " + B + " ---- C tomo el valor de A: " + C
                        + "---- D tomo el valor de B: " + D);

    }

}
